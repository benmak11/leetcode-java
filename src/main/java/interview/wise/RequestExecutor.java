package interview.wise;

import java.time.Clock;
import java.time.ZoneId;
import java.util.*;

/** WISE Interview Question || This is a classic Circuit Breaker / Rate Limiter pattern!
 * 
 * You are given a RequestExecutor class that executes requests to various services.
 *
 * public Response execute(Request request) {
 *     // perform your error tracking here
 *     return request.call();
 * }
 *
 * with the following helper method for tracking timestamps of service s coming in:
 *
 * public int getCurrentTimeInMins() {
 *     return Clock.getCurrentTimeStamp(); // this method returns the integer value that the request came in.
 *     For example, if request came in at 12:04 pm, it returns 4
 * }
 * There are two objects in relation to this problem:
 *
 * class Request {
 *     String name;
 *     Response response;
 *     public Response call() {
 *         return response;
 *     }
 * }
 *
 *
 * class Response {
 *     int status;
 *     String message;
 * }
 *
 * Example Walkthrough:
 * ServiceA   -->    Status 200 ("Success")
 * ServiceB   -->    Status 500 ("Failed")         // first failure
 * ServiceB   -->   Status 500 ("Failed")       // second failure
 * ServiceB   -->    Status 500 ("Failed").     // third failure
 * ServiceB  --->    ("Blocked - [service has hit threshold limit within allotted time]")
 * ... wait 10 mins...
 * ServiceC   -->   Status 200 ("Success")
 * ServiceB  -->    Status 200 ("Success")
 */
public class RequestExecutor {
    private class ServiceState {
        List<Integer> failureTimestamps = new ArrayList<>();
        Integer blockedAt = null;
    }

    public class Response {
        int status;
        String message;
    }

    public class Request {
        String name;
        Response response;

        public Response call() {
            return response;
        }
    }

    private static final int FAILURE_THRESHOLD = 3;
    private static final int FAILURE_WINDOW_MINS = 10;
    private static final int BLOCK_DURATION_MINS = 5;

    private Map<String, ServiceState> serviceStates = new HashMap<>();

    public Response execute(Request request) {
        String serviceName = request.name;
        int currentTime = getCurrentTimeInMinutes();

        serviceStates.putIfAbsent(serviceName, new ServiceState());
        ServiceState state = serviceStates.get(serviceName);

        if (state.blockedAt != null) {
            if (currentTime - state.blockedAt < BLOCK_DURATION_MINS) {
                Response blockedResponse = new Response();
                blockedResponse.status = 429; // Too Many Requests
                blockedResponse.message = "Blocked - service has hit threshold limit within alloted time frame.";
                return blockedResponse;
            } else {
                state.blockedAt = null; // Unblock the service
                state.failureTimestamps.clear();
            }
        }

        // Execute the actual request
        Response response = request.call();

        if (response.status != 200) {
            // track current failure
            state.failureTimestamps.add(currentTime);

            if (state.failureTimestamps.size() >= FAILURE_THRESHOLD) {
                // Get the timestamp of the 3rd most recent failure
                int thirdMostRecnt = state.failureTimestamps.get(
                        state.failureTimestamps.size() - FAILURE_THRESHOLD
                );

                if (currentTime - thirdMostRecnt <= FAILURE_WINDOW_MINS)
                    state.blockedAt = currentTime;
            }

            while (!state.failureTimestamps.isEmpty() &&
                    currentTime - state.failureTimestamps.get(0) > FAILURE_WINDOW_MINS) {
                state.failureTimestamps.remove(0);
            }
        }

        return response;
    }

    private int getCurrentTimeInMinutes() {
        return Math.toIntExact(Clock.tickMinutes(ZoneId.of("UTC")).instant().getEpochSecond() / 60);
        //return (int) (System.currentTimeMillis() / 60000);
    }
}

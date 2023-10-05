# Problem Walkthrough and runtime
This is called Boyer-Moore Vote algorithm and the idea here is having candidates with diff values and two counters. 
For each number in the array we see if it equals the candidate and increment the count. 
The two numbers left after this process are the majority candidates. 
Loop through the array again then make sure that each candidate does indeed have more than n/3 occurrences

Runtime `O(n)`
Space   `O(1)`
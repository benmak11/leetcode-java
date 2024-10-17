package problemset.a0162;

public class FindPeakElementAltered {

    /**
     * Find the peak element if the array and if there is no peak return -1
     * @param arr - the array of elements
     * @return peak element in the array
     */
    public int findPeakElement(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left)  / 2;

            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1])
                return arr[mid];
            else if (arr[mid] > arr[mid + 1])
                right = mid;
            else if (arr[mid] < arr[mid + 1])
                left = mid + 1;
        }
        return -1;
    }
}

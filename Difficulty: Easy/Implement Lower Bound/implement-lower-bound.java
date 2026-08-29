class Solution {
    int lowerBound(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int sum=nums.length;
        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                 sum = Math.min(sum,mid);
                 high = mid - 1;   
             }
            else if (nums[mid] > target) {
                sum = Math.min(sum,mid);
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return sum;
 
    }
}

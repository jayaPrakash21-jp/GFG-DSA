class Solution {
    int upperBound(int[] nums, int x) {
        // code here
        

                 for(int i=0;i<nums.length;i++){
                    if(nums[i]>x){
                        return i;
                    }
                 }
                 return nums.length;
            }
        }

    


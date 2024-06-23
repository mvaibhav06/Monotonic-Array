class Solution {
    public boolean isMonotonic(int[] nums) {
        if(nums.length==1){
            return true;
        }
        if(nums[0] >= nums[1]){
            int i = 1;
            for(i=1; i<nums.length-1; i++){
                if(nums[i] < nums[i+1]){
                    break;
                }
            }
            if(i == nums.length-1){
                return true;
            }    
        }
        if(nums[0] <= nums[1]){
            int i = 1;
            for(i=1; i<nums.length-1; i++){
                if(nums[i] > nums[i+1]){
                    break;
                }
            }
            if(i == nums.length-1){
                return true;
            }    
        }
        return false;
    }
}

class Solution {
    public int maxSubArray(int[] nums) {
        int cs=nums[0];
        int ms=nums[0];
        for(int i=1; i<nums.length; i++){
            if(cs+nums[i]>nums[i]){
                cs=nums[i]+cs;
            }else{
                cs=nums[i];
            }
            if(cs>ms){
                ms=cs;
            }
        }return ms;
    }
}
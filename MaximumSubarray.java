class Solution {
    public int maxSubArray(int[] nums) {
        int maxSoFar=0;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            maxSoFar = maxSoFar + nums[i];
            if(maxSoFar>ans){
                ans = maxSoFar;
            }
            if(maxSoFar<0){
                maxSoFar =0;
            }
        }
        return ans;
    }
}

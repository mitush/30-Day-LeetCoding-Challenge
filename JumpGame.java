class Solution {
    public boolean canJump(int[] nums) {
        if(nums==null || nums.length==0)return false;
        int n = nums.length;
        int m =0;
        for(int i=0;i<n;i++){
            if(i>m){
                return false;
            }
            m = Math.max(nums[i]+i,m);
        }
        return true;
    }
}

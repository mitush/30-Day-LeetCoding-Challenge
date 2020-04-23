class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums==null || nums.length==0)return 0;
        int ans =0;
        int n = nums.length;
        int sum=0;
        Map<Integer,Integer> map = new HashMap();
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(sum==k){
                ans++;
            }
            if(map.containsKey(sum-k)){
                ans+=map.get(sum-k);
            }
            if(map.containsKey(sum)){
                map.put(sum,map.get(sum)+1);
            }
            else{
                map.put(sum,1);
            }
        }
        return ans;
    }
}

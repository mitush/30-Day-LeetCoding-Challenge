class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer,Integer> map = new HashMap();
        int sum=0;
        int maxLen=0;
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                k=-1;
            }
            else{
                k=1;
            }
            sum+=k;
            if(sum==0){
                maxLen=i+1;
            }
            if(map.containsKey(sum)){
                if(maxLen< (i-map.get(sum))){
                    maxLen=i-map.get(sum);
                }
            }
            else{
                map.put(sum,i);    
            }
        }
        return maxLen;
    }
}

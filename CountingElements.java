class Solution {
    public int countElements(int[] arr) {
        int[] count = new int[1002];
        for(int i:arr){
            count[i]++;
        }
        int ans =0;
        for(int i=0;i<1001;i++){
            if(count[i]>0 && count[i+1]>0){
                ans+= count[i];
            }
        }
        return ans;
    }
}

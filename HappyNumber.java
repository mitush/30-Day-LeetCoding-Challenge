class Solution {
    public boolean isHappy(int n) {
        return isHappyUtil(getSquare(n),n);
    }
    public boolean isHappyUtil(int n,int orig){
        if(n==1 || getSquare(n)==1) return true;
        if(n==orig || n==4) return false;
        return isHappyUtil(getSquare(n),orig);
    }
    public int getSquare(int n){
        int p = n;
        int ans =0;
        while(p>0){
            int k = p%10;
            p = p/10;
            ans+=k*k;
        }
        return ans;
    }
}

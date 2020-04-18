class Solution {
    public boolean checkValidString(String s) {
        return check(s,0,0);        
    }
    public boolean check(String s, int start, int count) {
        if (count < 0) return false;
        int i = start;
        while(i<s.length()) {
            if(s.charAt(i)=='('){
                count++;
            }
            else if (s.charAt(i)==')') {
                if (count<=0) return false;
                count--;
            }
            else if (s.charAt(i)=='*') {
                return check(s,i+1,count+1) || check(s,i+1,count-1) || check(s,i+1,count);
            }
            i++;
        }
        return count == 0;
    }
}

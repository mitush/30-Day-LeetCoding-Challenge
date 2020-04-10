class Solution {
    public boolean backspaceCompare(String S, String T) {
        return getString(S).equals(getString(T));
    }
    public String getString(String s){
        StringBuilder str = new StringBuilder("");
        int ind=0;
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)=='#'){
                if(str.length()>0){
                    str.setLength(str.length()-1);
                }
            }
            else{
                str.append(""+s.charAt(i));
                ind++;
            }
            i++;
        }
        return str.toString();
    }
}

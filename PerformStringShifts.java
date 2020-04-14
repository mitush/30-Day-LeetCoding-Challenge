class Solution {
    public String stringShift(String s, int[][] shift) {
        int mov = 0;
        int dir = 0;
        int val = 0;
        for(int[] s1:shift){
            dir = s1[0];
            val = s1[1];
            if(dir==0){
                mov+=val;
            }
            else{
                mov-=val;
            }
        }
        if(mov<0){
            return rotate(s,-1*mov,true);
        }
        return rotate(s,mov,false);
    }
    public String rotate(String s, int mov,boolean flag){
        int l = s.length();
        int rot = mov%l;
        if(rot==0)return s;
        StringBuilder str = new StringBuilder("");
        l = 0;
        if(flag){
            l = s.length()-rot;
        }
        else{
            l = rot;
        }
        for(int i=0;i<l;i++){
            str.append(""+s.charAt(i));
        }
        if(flag){
            l = s.length()-rot;
        }
        else{
            l = rot;
        }
        StringBuilder str1 = new StringBuilder("");
        for(int i=l;i<s.length();i++){
            str1.append(""+s.charAt(i));
        }
        return str1.append(str).toString();
    }
}

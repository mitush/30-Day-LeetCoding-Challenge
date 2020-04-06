class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String ,List<String>> map = new HashMap();
        for(String s:strs){
            char tempArray[] = s.toCharArray(); 
            Arrays.sort(tempArray);
            String key = new String(tempArray);
            List<String> list = map.computeIfAbsent(key,k->new ArrayList());
            list.add(s);
        }
        List<List<String>> ans = new ArrayList();
        for (Map.Entry<String,List<String>> entry : map.entrySet()){  
            ans.add(new ArrayList(entry.getValue())); 
        }
        return ans;
    }
}

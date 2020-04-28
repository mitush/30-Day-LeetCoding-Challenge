class FirstUnique {
    Map<Integer,Integer> map;
    Set<Integer> uSet;
    
    public FirstUnique(int[] nums) {
        map = new HashMap();
        uSet = new LinkedHashSet();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])<2){
                uSet.add(nums[i]);
            }
        }     
    }
    
    public int showFirstUnique() {
        if(!uSet.isEmpty()){
            return uSet.iterator().next();
        }
        return -1;
    }
    
    public void add(int value) {
        if(map.containsKey(value)){
           map.put(value,map.get(value)+1);
            if(uSet.contains(value)){
                uSet.remove(value);
            }
        }
        else{
            map.put(value,1);
            uSet.add(value);
        }
    }
}

/**
 * Your FirstUnique object will be instantiated and called as such:
 * FirstUnique obj = new FirstUnique(nums);
 * int param_1 = obj.showFirstUnique();
 * obj.add(value);
 */

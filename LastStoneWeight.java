class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue(new Comparator<Integer>(){
            public int compare(Integer i1,Integer i2){
                return i2-i1;
            }
        });
        for(int i:stones){
            maxHeap.offer(i);
        }
        while(maxHeap.size()>1){
            int stone1 = maxHeap.poll();
            int stone2 = maxHeap.poll();
            if(stone1!=stone2){
                maxHeap.offer(stone1-stone2);
            }
        }
        return maxHeap.size()>0?maxHeap.peek():0;
    }
}

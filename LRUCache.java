class LRUCache {
    class Node{
      Node prev, next;
      int key, data;
      Node(int k, int v){
        key = k;
        data = v;
      }
    }
    Node head = new Node(0, 0);
    Node tail = new Node(0, 0);
    Map<Integer, Node> map;
    int capacity;
    
    public LRUCache(int cap) {
        capacity = cap;
        map = new HashMap();
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
      int res = -1;
      if(map.containsKey(key)){
        Node n = map.get(key);
        remove(n);
        insertToHead(n);
        res = n.data;
      }
      return res;   
    }
    
    public void put(int key, int value) {
      if(map.containsKey(key)){
        Node n = map.get(key);
        remove(n);
        n.data = value;
        insertToHead(n);
      } else {
        
        if(map.size() == capacity){
           map.remove(tail.prev.key); 
           remove(tail.prev);
        } 
        
        Node n = new Node(key, value);
        insertToHead(n);
        map.put(key, n);
      }  
    }
    
    private void remove(Node n){
      n.prev.next = n.next;
      n.next.prev = n.prev;
    }
    
    private void insertToHead(Node n){
      Node headNext = head.next;
      head.next = n;
      headNext.prev = n;
      n.prev = head;
      n.next = headNext;
    }
    
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */

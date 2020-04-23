/**
 * // This is the BinaryMatrix's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface BinaryMatrix {
 *     public int get(int x, int y) {}
 *     public List<Integer> dimensions {}
 * };
 */

class Solution {
    public int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
        List<Integer> s = binaryMatrix.dimensions();
        int n = s.get(0);
        int m = s.get(1);
        int ans = -1;
        int col = m-1;
        int row = 0;
        while(row<n && col>=0){
            if(binaryMatrix.get(row,col)==1){
                ans = col;
                col--;
            }
            else{
                row++;
            }
        }
        return ans;
    }
        
}

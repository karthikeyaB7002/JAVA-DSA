//https://leetcode.com/problems/sqrtx/
//Given a non-negative integer x, return the square root of x rounded down to the nearest integer.
//The returned integer should be non-negative as well.


class Solution {
    public int mySqrt(int x) {
        int start = 1;
        int end = x;

        while(start<=end){

            int mid = start + (end-start)/2;
            
                if(x==0){
                    return 0;
                }
               
                
            

            if(x/mid<mid){
                end = mid - 1;

            }
            else {
                start = mid+1;
            }
            
        }
        return end;
        
    }
}

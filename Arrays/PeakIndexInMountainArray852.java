//https://leetcode.com/problems/peak-index-in-a-mountain-array/
//This problem is taking from the leetcode number 852
//You are given an integer mountain array arr of length n
//where the values increase to a peak element and then decrease.

//Return the index of the peak element.

//Your task is to solve it in O(log(n)) time complexity
class Solution {
    public int peakIndexInMountainArray852(int[] arr) {
        int start = 0;
        int end = arr.length-1;
//loop for the checking the largest element in the array
        while(start<end){

            int mid = start + (end - start)/2;
//if mid is larger than mid+1 means we are actually in the descending order of the array 
            if(arr[mid]>arr[mid+1]){
                //in this case there is possiblility of end might be the largest element in the array
                end = mid;
            }
            //if mid is not larger than md+1 we can ignore the mid means we are in the ascending order of the array
            else{
                start = mid+1;

            }
        }
        //returns both the start or end because both are points to the largest element in the array
        return start;
        
    }
}

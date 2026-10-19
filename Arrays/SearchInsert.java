//Leetcode problem number is 35
//Given a sorted array of distinct integers and a target value,
//return the index if the target is found.
//If not, return the index where it would be if it were inserted in order.
//You must write an algorithm with O(log n) runtime complexity.
class Solution {
    public int searchInsert(int[] nums, int target) {
        int start =0;
        int end = nums.length-1;
//Loop for the middle term of the array
        while(start<=end){
            int mid = start + (end - start)/2;
//changing the end to previous index of the middle
            if(target<nums[mid]){
                end = mid-1;
            }
//changing the start to next index of the middle            
            else if(target>nums[mid]){
                start = mid+1;
            }
//Return the middle value if it exist in the array
            else{
                return mid;
            } 
//Returns the index value of the where it would be inserted
        }
        return start;
        
    }
}

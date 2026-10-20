//These problem is taken from the leetcode 34 problem
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/?utm_source=chatgpt.com
//Given an array of integers nums sorted in non-decreasing order, 
//find the starting and ending position of a given target value.
//If target is not found in the array, return [-1, -1].
//You must write an algorithm with O(log n) runtime complexity.
class Solution {
    public int[] searchRange34(int[] nums, int target) {
        //initial answer is -1,-1
        int[] ans = {-1,-1};
        //Index value of the starting position
        ans[0] = search(nums,target,true);
        //Index position of the ending position
        ans[1] = search(nums,target,false);
        return ans;
        

    }
    //Method to searrch the first and last index
    int search(int[] nums,int target,boolean FindFirstIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start +(end-start)/2;

            if(target<nums[mid]){
                end = mid-1;
            }
            else if(target>nums[mid]){
                start = mid+1;
            }
            else{
                ans = mid;
            //If the mid value exists true performs
                if(FindFirstIndex){
                    end = mid-1;
                    //Again the end is changed 
                    //Middle index is calculated
                }//False the start is changed
                else{
                    start = mid+1;
                }
            
        }
    }
    return ans;
 }
}

 

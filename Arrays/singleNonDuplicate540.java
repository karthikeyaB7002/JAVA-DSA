
//https://leetcode.com/problems/single-element-in-a-sorted-array/
//This problem is taken from the leetcode 540
//our are given a sorted array consisting of only integers where every element appears exactly twice,
//except for one element which appears exactly once.

//Return the single element that appears only once.



class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length-1;

        while(start<end){

            int mid = start + (end-start)/2;
//if the mid is odd make it even 
            if(mid%2==1){
                mid--;
            }
          //if the mid and mid+1 is equal means the target element is in the right side
            if(nums[mid]==nums[mid+1]){
                start = mid+2;
            }
              //else the target element is left of the mid 
            else{
                end = mid;
            }
             
        }
      //returns the start after the loop the target element refers as the start 
      //Because after the loop start==end 
       return nums[start];
        
    }
}

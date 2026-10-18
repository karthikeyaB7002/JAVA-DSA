/*
 * LeetCode 1295: Find Numbers with Even Number of Digits
 * Problem: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
 *
 * Approach: Count the digits in each number and check
 * whether the digit count is even.*/
     
class Solution {
    public int findNumbers(int[] nums) {
        int val=0;
        // counting the digits in the numbers of array
        for(int i=0;i<nums.length;i++){
            int count=0;
            int temp = nums[i];
            while(temp!=0){
                count++;
                temp=temp/10;
            }
            //checks whether the number is even or not and counts
            if(count%2==0){
                val++;

            }
        }
        //Returns the count value
        return val;
       
}
}

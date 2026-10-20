//These problem is taken from the leetcode number 744
//You are given an array of characters letters that is sorted in non-decreasing order, 
//and a character target. There are at least two different characters in letters.

//Return the smallest character in letters that is lexicographically greater than target.
//If such a character does not exist, return the first character in letters.

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;
        //loop to traverse the loop
        while(start<=end){
            int mid = start + (end - start)/2;
            //if target is smaller than end shift to less than mid
            if(target<letters[mid]){
                end = mid-1;
            }
             //if target is greater than start shift to greater than mid
             else{
                start = mid+1;
             }
            
        }
        //while brakes the start points the smallest value greater than target
        if(start==letters.length){
            return letters[0];
        }
        //Returns the value of the expexted result
        return letters[start];
        
    }
}

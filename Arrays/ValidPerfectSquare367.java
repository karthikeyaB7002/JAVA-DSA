//https://leetcode.com/problems/valid-perfect-square/
//These problem is taken from the leetcode 367
//Given a positive integer num, return true if num is a perfect square or false otherwise.
//A perfect square is an integer that is the square of an integer.
//In other words, it is the product of some integer with itself.


class Solution {
    public boolean isPerfectSquare(int num) {
      //prefer the long becaue when mid*mid reaches the size of int in java
        long start = 0;
        long end = num;

        while (start <= end) {
            long mid = start + (end - start) / 2;

            if (mid * mid > num) {
                end = mid - 1;
            } else if (mid * mid < num) {
                start = mid + 1;
            } else {
                return true;
            }
        }

        return false;
    }
}

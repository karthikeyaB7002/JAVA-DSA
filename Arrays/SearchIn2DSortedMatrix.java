//You are given a 2D integer matrix where each row and each column is sorted in ascending order.
//Write a Java method search(int[][] arr, int target) that finds the target element and 
//returns its position as an array containing the row index and column index.
//If the target is not present, return {-1, -1}.
//Time complexity is O(n+m)

import java.util.Arrays;
public class SearchIn2DSortedMatrix{
    public static void main(String[] args) {
        int[][] arr= {
            {10,20,30,40},
            {15,25,35,45},
            {28,29,37,49},
            {33,34,38,50},
        };
        int []result = search(arr,49);
        System.out.println(Arrays.toString(result));
    }
    static int[] search(int[][] arr,int target){
        int row = 0;
        int col = arr.length-1;

        while(row<arr.length && col>=0){

            if(arr[row][col]==target){
                return new int[]{row,col};
            }
          //if the element is less than the target element increase the row by one
          //Example if arr[0][3]=40 and it is our element
          //if(40<49) true it means the elements in that row shoulb be less than the 40
            if(arr[row][col]<target){
                row++;
            }
              //else if element is greater than the target it may exist in the same row 
              //but the col elements is greater than the target ignore the col k
            else{
                col--;
            }
        }
        return new int[]{-1,-1};
    }
}

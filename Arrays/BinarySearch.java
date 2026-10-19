//This problem statement is from leetcode number 704
//Given an array of integers nums which is sorted in ascending order,
//    and an integer target, write a function to search target in nums.
 //   If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.

 
//Basic Binary Search using the asscending order of sorted array
public class BinarySearch {
    public static void main(String[] args) {
      //Sorted array of elements
        int[] arr ={-2,-1,2,3,5,6,7,8,9};
        int target = 9;
        int result = BinarySearch(arr,target);
        System.out.println(result);

    }
    static int BinarySearch(int arr[],int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
          //To find the middle term of the array 
            int mid = start + (end - start)/2;
            if(target>arr[mid]){//if the middle term is less than the searching element the start begin with the middle+1 
                start = mid+1;
            }
            else if(target<arr[mid]){//if the middle term is greater than the searching element the end begin with the middle-1 
                end = mid-1;
            }
            else{//if the middle element is matches the target returns the index of the searching element
                return mid;
            }
           
        }
        return -1;
      //Return -1 if the term is not found in the array
        
    }
}

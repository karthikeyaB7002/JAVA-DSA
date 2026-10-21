//https://leetcode.com/problems/search-in-a-sorted-array-of-unknown-size/?utm_source=chatgpt.com
//This problem is taken from the leetcode number is 702
//You have a sorted array of unique elements and an unknown size. 
//You cannot access the array directly, but you can use the ArrayReader interface to access it.
//You can call ArrayReader.get(i), which:
//- Returns the value at index i (0-indexed) if it is within the array's bounds.
//- Returns 2147483647 if the index is outside the array's bounds.
//You are also given an integer target.
//Return the index k where secret[k] == target, or return -1 if the target does not exist.
//Your algorithm must run in \(O(\log n)\) time.



public class SearchInSortedArrayOfUnknownSize702{
    public static void main(String[]a){
        int[] arr = {12,24,36,48,56,77,89,90,98,99,100,101,102};
        int target = 36;
        System.out.println(ans(arr,target));


    }
    //search between the ranges of the array
    //dividing the array into the sub arrays 
    static int ans(int[] arr,int target){
       //Initial size of the subarray size is 2
        int start = 0;
        int end =1;
        //Stop the searching after the element is found 
        while(target>arr[end]){
            //temp is new start after the first search
            int temp = end+1;
            //end is changed and the size of the subarray is increases twices
            //end = previous index of end + sizeof the previous subarray *2
             end = end + (end - start +1)*2;
             //temp is now intilized to the start 
             start = temp;
        }
        
            return search(arr, target,start,end);
    }

    //same as the binary search pattern
    static int search(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid = start + (end-start)/2;

            if(target<arr[mid]){
                end = mid - 1;
            }
            else if(target>arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}

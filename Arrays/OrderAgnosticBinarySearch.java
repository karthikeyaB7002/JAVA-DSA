//Order-Agnostic Binary Search**

//Write a Java program to search for a target element in a sorted array using Binary Search. The array can be sorted in ascending or descending order. Return the index of the target if found; otherwise, return -1.

import java.util.Scanner;
public class OrderAgnosticBinarySearch{
    public static void main(String[]a){
         
        Scanner sc = new Scanner(System.in);
      //Enter the size of the array
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        if(size<1){//Allowing the size of the array only when the size is greater than 1
            System.out.println("The size of the array must be atleat one");
        }
        else{
        System.out.println("Enter the elements sorted order:");
        int[] arr = new int[size];
        //Assing the elements in array using the for loop
        for(int i=0;i<size;i++){
            
            arr[i] = sc.nextInt();
        }//Accessing the elements  of the array using the for loop
         for(int i=0;i<size;i++){
            
            System.out.println(arr[i]);
        }
        
        //Entering the element for searching
        System.out.println("Enter the element to search :");
        int target = sc.nextInt();
        int result = BinarySearch(arr,target);
        System.out.println("Index position of the element :"+result);
        sc.close();
    }

    }
  //Search the element in sorted array
    static int BinarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        if(arr.length==0){//Result -1 if array size is 0
            return -1;
        }
               while(start<=end){
                 
                 int mid = start + (end-start)/2;
                 //if the target is middle element it returns
                 //In case of the ascending order sorted array
                 if(target == arr[mid]){
                   return mid:}
                 if(arr[start]<arr[end]){
                    if(target<arr[mid]){
                       end = mid-1;}
                       else{
                          start = mid+1;}    
                       }
                   //In case of the descending order sorted array
            else{
                if(target>arr[mid]){
                    end = mid-1;
                     }
                       else{
                          start = mid+1;
                        }   

            }

        }
      //Returns -1 if the searching element is not in the array
        return  -1;

    }
    
}




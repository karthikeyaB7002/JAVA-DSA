import java.util.Arrays;
public class BubbleSort{
    public static void main(String[] a){

        int[] arr={23,45,64,32,55};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void bubbleSort(int[] arr){
        boolean swap ;
//These is the outer loops and that indicates how many times the inner loop can compare and 
      //swap until we get the sorted array

        for(int i=0;i<arr.length-1;i++){
            //initially the swap is false at every loop because if any comparision fails
          //that indicates that the array is already sorted and we dont need to run unneccessary loop iterations after that

            swap = false;
            //inner loop that how many compares that the loop going to compare between the elements in the array

            for(int j=1;j<arr.length-i;j++){
//if the comparison is true the swap of the element is done
                if(arr[j]<arr[j-1]){

                   int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    swap = true;
                }
            }
            //breaks the loop after the inner loop does not performs the swap between the elements
            if(!swap){
                break;

            }
            
            
        }
    }
}

//Output:
//[23, 32, 45, 55, 64]

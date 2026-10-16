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

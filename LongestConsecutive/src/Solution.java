import java.util.Arrays;

class Solution {
    public int longestConsecutive(int[] nums) {
        int number=0;
        int [][] newarray=new int[1][1];
        Arrays.sort(nums);
        if(nums.length>=1){
            int holder=1;
            number=holder;
        for(int index=1; index<nums.length; index++){
            if(nums[index]-nums[index-1]==1 ){
                holder++;
                if(holder>number){
                    number=holder;
                }             
            }
            else if(nums[index]==nums[index-1]){

            }
            else{             
                holder=1;  
            }
        }  }
        return number;
       
    }
}
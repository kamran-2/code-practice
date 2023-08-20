package leetcode;

import java.util.Arrays;

import sorting.count;

public class minmaxdiff {
    public static int solution(int[] nums, int p){
        Arrays.sort(nums);
        int last =nums[nums.length-1],count=0,diff=0;
        while(diff<=last){
           count = 0;
           for(int i=0;i<nums.length-1;i++){
                if (nums[i+1]-nums[i]<=diff){
                       i++;
                       count++;
                     
                     
                }
           } 
           if(count >= p){
               return diff;
           }
          diff++;
        }
        return 2;
    }

    public static void main(String arr[]){
      int nums[] = {1,2,2,4};  
      System.out.println(solution(nums,1));
    
}
}
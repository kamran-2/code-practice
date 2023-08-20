package leetcode;

import java.util.Arrays;

public class palindrom {
    public static void main (String[] args){
    int nums[] = {2,5,6,0,0,1,2};
    int target = 0;
    int first = 0,last = nums.length-1,mid;
        // Arrays.sort(nums);
        while(last>=first){
           mid = (first+last)/2;
        //    System.out.println(nums[mid]);
        if(nums[mid] == target){
        
            System.out.println("found at "+mid+" index");
           }
        if(nums[first]<nums[mid]){
           
         if(nums[mid]<=target && nums[first]>=target){
               last = mid-1;
           }
           else{
               first = mid+1;
           }
          
        }
        else{
            if(nums[mid]>=target && nums[mid]>=nums[last]){
                first=mid +1 ;
            }
            else{
                last = mid -1;
            }
        }
    }
        // System.out.println("not found");
}
}


public class rotatearray {
    public static void rotatearr(int[] nums,int k){
        int[] newarray = new int[k];
       
        int f=0;
        if(nums.length>1){
                 for(int j=nums.length-1;j>=k;j--){
            if(f<k){
                 newarray[f] = nums[j];
                 f++;
            }

             nums[j] = nums[j-k];
        }
        
         for(int i=0;i<k;i++){
            nums[i] = newarray[k-1-i];
        }
        }
      
    }
    public static void main(String aa[]){
         int nums[] = {1};
         int n = 3;
         rotatearr(nums, n);
         for(int i=0;i<nums.length;i++){
            System.out.print(" "+nums[i]);
         }
    }
}

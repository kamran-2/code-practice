public class patching {
   
        public static int minPatches(int[] nums, int n) {
           int sum = 1;
           int count =0;
           int i=0;
           while(sum<n && i<nums.length-1){
               if(sum<nums[i]){
                  sum+=sum+1;
                  count++;
               }
               else{
                   sum+=nums[i+1];
                   i++;
               }
               
           }
             return count;
        }
      
    
        public static void main(String aa[]){
            int [] nums={1,5,10};
            int n=20;
            System.out.print(minPatches(nums,n));
        }
}

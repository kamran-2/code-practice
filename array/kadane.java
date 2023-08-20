package array;

public class kadane {

    public static int maxsum(int a[]){
        int max = Integer.MIN_VALUE,curr=0;
        for (int i=0 ;i<a.length-1;i++){
            curr = curr +a[i];
            
            if (curr<0){
                curr=0;
                
            }
            if(curr>max){
                max = curr;
            }   
    }
     return max;
}
    public static void main(String aa[]){
         int a[] = {-2,-3,4,-1,-2,1,5,-3};
         System.out.println("Maximum sum is "+maxsum(a));
    }
}

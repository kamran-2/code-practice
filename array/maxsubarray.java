package array;

public class maxsubarray {

     public static int prefixarr(int a[]){
        int max = Integer.MIN_VALUE,curr;

        int prefix[] = new int[a.length];
        prefix[0]=a[0];
        for (int i=1; i<a.length ;i++){
              prefix[i]= prefix[i-1] + a[i];
              System.out.println(prefix[i]);
        }
        
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                curr = (i== 0)?prefix[j]:prefix[j] - prefix[i-1];
                if(max<curr){
                   max = curr;
                }
            }
        }
        return max;
    }
     public static void main(String aa[]){
     //code
     int a[] = {1,-2,5,6};
     System.out.print("Maximum value ="+prefixarr(a));
    }
}


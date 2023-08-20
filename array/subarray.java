package array;

public class subarray {
    public static void printarray(int a[]){
        
        for(int i=0;i<=a.length-1;i++){
            for(int j=i;j<=a.length-1;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(a[k]);
                }
                System.out.println();
            }
            System.out.println();
        }
        
    }
    public static void main(String aa[]){
        int a[] = {2,5,6,9};
        printarray(a);
       
    }
}

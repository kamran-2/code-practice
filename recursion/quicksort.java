public class quicksort {
    public static int fn(int num[],int low,int high){
       int pivot = num[low];
       int i=0,j=0;
        while(i<j){
          while(pivot)
        }
        return 1;
    }
    static int partition;
    public static int[] sort(int num[],int low,int high){
        if(low<high){
            partition = fn(num ,low, high);
            sort(num, low, partition-1);
            sort(num, partition, high);
        }
        return num;
    }
    public static void main(String arr[]){

    }
}

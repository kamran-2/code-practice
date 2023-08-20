package array;

public class reverse {
    public static void reversearray(int a[]){
        int temp,start=0,end=a.length-1;
        while (start<end){
            temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args){
        int a[] = {2,5,6,9,11,45};
        reversearray(a);
        for(int column=0;column<a.length;column++){
            System.out.print(" "+a[column]);
          
       }
    }
}

package bitmanupulation;

import java.util.Scanner;

public class evenodd {
    public static void check(int value){
        // int bit  = 1;
        if ((value&1) == 1){
               System.out.print("Number is odd");
        }
        else{
            System.out.println("number is even");
        }
    }
    public static int setbit(int n, int i){
         int bitmask = 1<<i;
        System.out.println(Integer.toBinaryString(n));
        // System.out.println(Integer.toBinaryString(bitmask));
        System.out.println(Integer.toBinaryString(n|bitmask));
        return n|bitmask;
        
    }

    public static int getbit(int n,int i){
        int bitmask = 1<<i;
        System.out.println(Integer.toBinaryString(n));
        // System.out.println(Integer.toBinaryString(bitmask));
        // System.out.println(Integer.toBinaryString(n&bitmask));
        if((n&bitmask)==0){

              return 0;
        }
        else{
            return 1;
        }
    }
    public static void main(String arr[]){
        //System.out.println("Enter the value");
        //    Scanner sc =  new Scanner(System.in);
        //    int value = sc.nextInt();
        //check(value);
           System.out.println(setbit(12, 1));
    }
}

package cutome;
import java.util.*;

public class bintodec{
    
     public static int decimal(int a){
        int k,dec=0,c=0;
        while(a>0){
         k = a%10;
         a = a/10;
         dec += k*(Math.pow(2,c));
         c++;
        }
        return dec;
     }
 public static void main(String ar[]){
    Scanner scn = new Scanner (System.in);
    int bi = scn.nextInt();
    System.out.println("Decimal equivalent of "+bi+" is: " +decimal(bi));
 }

}

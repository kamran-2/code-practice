package cutome;
import java.util.*;

public class dectobin {

    public static int binary(int a){
        int rem = 0, value=0,c=0;
        while(a>0){
            rem = a%2;
            a= a/2;
            value += rem*(Math.pow(10, c));
            c++;
        }
        return value;
    }
    public static void main(String ar[]){


       System.out.print(binary(14));
    }
}

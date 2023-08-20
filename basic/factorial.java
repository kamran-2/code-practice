import java.util.*;
public class factorial{
    public static int fac(int a){
        int fact = 1;
        for (int i =1;i<=a;i++){
            fact *=i;
        }
        return fact;
    }

    public static int binomial(int n,int r){
        if (r==0 || r==n){
            return 1;
        }
         else{
            int k = fac(n)/(fac(r)*fac(n-r));
            return k;
         }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your value of n");
        int n = sc.nextInt();
        System.out.print("Enter value of r");
        int r = sc.nextInt();
        System.out.println("Binomial coeffcient = " +binomial(n,r));
}

}
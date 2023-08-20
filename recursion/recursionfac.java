public class recursionfac {
    public static int fac(int n){
        if (n==0) return 1;
        // int fnm = fac(n-1);
        int fn = n*fac(n-1);

        return fn;

    }
    public static void main(String[] arr){
         System.out.println(fac(5));
    } 
}

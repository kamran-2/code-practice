public class naturalnumbersum {

    public static int printnaturalsum(int n){
        if (n == 1){
            return  1;
        }
        return n+printnaturalsum(n-1);
    }
    public static void main(String[] arr){
        System.out.println(printnaturalsum(10));
   } 
}

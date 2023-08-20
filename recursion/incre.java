public class incre {
    public static void increNumber(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        increNumber(n-1);
        System.out.println(n);
    }
    public static void main(String [] arr){
          increNumber(10);
    }
}

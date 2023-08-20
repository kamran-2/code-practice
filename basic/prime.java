public class prime {

    public static boolean isPrime(int a){
        if (a==2){
            return false;
        }
        for(int i=2;i<=Math.sqrt(a);i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
    public static void primeRange(int n){
        for(int i=2;i<=n;i++){
            if (isPrime(i)){
                  System.out.println(i);
            }
        }
       
    }
    public static void main(String ar[]){
       primeRange(100);
    }
}

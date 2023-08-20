package string;
import cutome.bintodec; 
public class substring {
    public static boolean queryString(String s, int n) {
       bintodec k = new bintodec(); 
       for(int i=0;i<s.length();i++){
           int l = k.decimal();
           System.out.println(l);
       }
        return false;
    }
    public static void main(String aa[]){
        queryString("1101",5);
    }
}

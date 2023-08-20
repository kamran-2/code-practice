public class pyramid {
    
   public static void patternc(){
    int row=5,column=5;
    for (int i = 1 ;i<=row;i++){
        for(int j=1;j<=column-i;j++){
            System.out.print(" ");
        }
        for(int k=1;k<=i;k++){
            System.out.print("*");
        }
        System.out.print("\n");
   }
   }
    public static void main(String a[]){
              patternc();
    }
}

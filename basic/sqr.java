public class sqr{
    public static void pattern(){
       
        for(int row=1;row<=5;row++){
            for(int column=1;column<=5;column++){
                 if(row==1 || column==1 || row==5 || column==5){
                    System.out.print("*");
                 }
                 else{
                    System.out.print(" ");
                 }
            }
            System.out.print("\n");
        }
    }
    public static void main(String ar[]){
        pattern();
    }
}

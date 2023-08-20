import java.util.*;
public class leap {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a year: ");
      int s = sc.nextInt();
        if(s%4==0){  
            if(s%100==0){
               if(s%400==0){
                 System.out.println("Year is a leap year");
               }
            }
            else{
                System.out.println("year is a leap year");
            }
        }
        else{
            System.out.print("Not a leap year");
        }


   }
 }

package arraylist;
import java.util.ArrayList;
import java.util.Arrays;

public class reverseArrayList {

    


    public static void main(String arr[]){
      ArrayList<Integer> li = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
      
      System.out.println(li);

      int i  =0;
      int j= li.size()-1;

      while(i<j){
        int temp =li.get(i);
        int temp2 = li.get(j);
        li.set(i,temp2);
        li.set(j,temp);
        i++;
        j--;
      }
      System.out.println(li);
    }
}

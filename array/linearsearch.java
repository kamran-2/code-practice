package array;

public class linearsearch {
    public static int search(int num[],int key){
        for (int i = 0 ;i<num.length-1;i++){
               if(num[i]==key){
                return 1;
               } 
    }
    return -1;
}
    public static void main(String[] args) {
        
    
          int num[] = {5,66,8,7,10};
          int k = search(num, 7);
          if (k==1){
            System.out.print("Number Found");
          }
          else{
            System.out.println("Not found in the array ");
          }
    }
}

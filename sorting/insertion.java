package sorting;

public class insertion {
    public static void sorting(int arr[]){
        
        for(int i=1;i<arr.length;i++){
           int curr = arr[i];
           int previous = i-1;
           while(previous>=0 && curr<arr[previous]){
                 arr[previous+1]=arr[previous];
                 previous--;
           }
           arr[previous+1] = curr;
        }         
        }
    
    
    public static void main(String[] args) {
        int arr[] ={5,4,1,3,2};
        sorting(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(""+arr[i]);
        }
    }
}

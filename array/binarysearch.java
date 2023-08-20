package array;

public class binarysearch {
     public static int search(int a[],int key){
          int first,last,mid;
          last = a.length-1;
          first = 0;

         

          while(last>first){
            mid = (first+last)/2;
            if(a[mid]==key){
                return mid;
            }
            else if(a[mid]<key){
                first = mid+1;
            }
            else{
                last=mid-1;
            }
          }
          return 1;
     }


     public static void main(String aa[]){
        //code here
        int a[] = {2,5,6,9,11,45};
        int k = search(a, 11);
        if(k==1){
            System.out.print("Key not present");
        }
        else{
            System.out.println("Element found at index: "+k);
        }
        
     }
}

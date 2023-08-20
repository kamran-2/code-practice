package array.array2;

public class search {
    public static boolean search(int[][] arr,int key){
        int endcol=arr.length-1,startrow=0;
        while(endcol>=0 && startrow<=arr.length){
            if(key<arr[startrow][endcol]){
                endcol--;
            }
            else if(key>arr[startrow][endcol]){
                startrow++;
            }
            else if(key==arr[startrow][endcol]){
                System.out.println("value found at ("+startrow+"," +endcol+")");
                return true;
            }

        }
        return false;
    }
    public static void main(String aa[]){
        int arr[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        System.out.print("value found = " +search(arr,39));
    }
}


package array.array2;
public class spiral {

    public static void printspiral(int[][] arr){
        int startrow = 0,startcol=0;
        int endrow = arr.length-1;
        int endcol = arr[0].length-1;
        while(startrow<=endrow && startcol<=endcol){
            
            for (int i = startcol ;i<=endcol;i++){
                System.out.print(" "+arr[startrow][i]);
                }
            for(int j=startrow+1;j<=endrow;j++){
                System.out.print(" "+arr[j][endcol]);
            }
            for(int i = endcol-1;i>=startcol;i--){
                System.out.print(" "+arr[endrow][i]);
            }
            for(int j = endrow-1;j>=startrow+1;j--){
                System.out.print(" "+arr[j][startcol]);
            }


         startcol++;
         endcol--;
         startrow++;
         endrow--;
        }
         

    }
    public static void main(String aa[]){
        int arr[][]={{1,2,3},{2,3,4},{3,4,5},{4,5,6}};
         printspiral(arr);
    }
}

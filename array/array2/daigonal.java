package array.array2;

public class daigonal {
    public static int digonalsum(int[][] arr){
        int sum=0;

        // complexity O(n^2)
        // if (arr!= null && arr[0].length > 1){
        //     for (int i = 0;i<arr.length;i++){
        //         for(int j =0;j<arr.length;j++){
        //             if((i==j)||(i+j==arr.length-1)){
        //                 sum+=arr[i][j];  
        //             }
        //         }
        //     }
        // }



        // complexity O(n)
        for(int i=0;i<arr.length;i++){     
            sum += arr[i][i] ;
            if(i!=arr.length-1-i)
            sum += arr[(arr.length)-1 -i ][i ];
        }
         return sum;
    }
    public static void main(String aa[]){
        int arr[][]={{1,2,3},{2,3,4},{3,4,5}};
        System.out.print("Sum of digonal = " +digonalsum(arr));
    }
}

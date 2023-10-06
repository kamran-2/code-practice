package leetcode;
public class nqueenrow {
    //isvalid

    public static boolean isvalid(char queen[][],int row,int column){

        for(int i = row-1;i>=0;i--){
            if(queen[i][column]=='Q'){
                return false;
        }
        }

        for(int i = row-1,j=column-1;i>=0&&j>=0;i--,j--){
                if(queen[i][j]=='Q'){
                return false;
        }
        }


          for(int i = row-1,j=column+1;i>=0&&j<queen.length;i--,j++){
                if(queen[i][j]=='Q'){
                return false;
        }
        }

        return true;
    }
    //queen set
    public static void  possiblequeen(int row,char queen[][]){
        if(row==queen.length){
            printchess(queen);
            return;
        }


        for(int column=0;column<queen.length;column++){
            if(isvalid(queen,row,column)){
            queen[row][column] = 'Q';
            possiblequeen(row+1,queen);
            queen[row][column]= 'X';
        }
    }
    }
    //print
    public static void printchess(char queen[][]){
        System.out.println("_________________Out comes__________________");
        for(int i=0;i<queen.length;i++){
              for(int j=0;j<queen.length;j++){
                System.out.print(queen[i][j]+" ");
              }
              System.out.println(" ");
        }  
    }
 
    public static void main(String arr[]){
        int n = 4;
        char queen[][] = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                queen[i][j]='X';
        }
    }
    possiblequeen(0,queen);
}
}

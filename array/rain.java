package array;

public class rain {
    public static int raintrack(int a[]){
        int water=0;
        int leftmax[] = new int[a.length];
        int rightmax[] = new int[a.length];
        leftmax[0]=a[0];
        for(int i=1;i<=a.length-1;i++){
            leftmax[i]= Math.max(a[i], leftmax[i-1]);
           
        }
        rightmax[a.length-1]= a[a.length-1];
        for(int i=a.length-2;i>=0;i--){
            rightmax[i]= Math.max(a[i], rightmax[i+1]);
        }

        for(int i=0;i<a.length;i++){
            int level = Math.min(rightmax[i],leftmax[i]);
            if(level-a[i]>=0){
                water+= (level - a[i])*1;
            }
        }
        return water;
    }
    public static void main(String aa[]){
        int a[]={4,2,0,6,3,2,5};
          System.out.print(" water filled =" +raintrack(a));
    }
}

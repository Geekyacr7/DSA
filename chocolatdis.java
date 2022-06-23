import java.util.Arrays;

public class chocolatdis {
    public static void main(String[] args) {
        
        int min=Integer.MAX_VALUE;
        int a[]={3,4,1,9,56,7,9,12};
    Arrays.sort(a);
        int m=5;
        for (int i=0;(i+m-1)<8 ;i++)
        {
            int d= a[i+m-1]-a[i];

            if (d>min){
                min=d;
            }
        }System.out.println("THE DIFF"+"  "+ min );

    }
    
}

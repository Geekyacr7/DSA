import java.util.Arrays;
public class twosum {

    public static void main(String args[])
     {
    int a[]={2,9,6,3,1,20,4};
    int sum=9;
   Arrays.sort(a);
    int i=0;
    int j=a.length-1;
    while(i<j)
    {
        int k= a[i]+a[j];
        if (sum==k)
        {
            System.out.println(a[i]+" "+a[j]+ " i index "+ i + " j index "+ j);
            return;
        }
        else if (k> sum){
                 j--;
             }
             else if (k<sum){
                 i++;
             }
        
    }
        
    }
    
}

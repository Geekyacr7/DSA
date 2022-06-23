import java.util.Arrays;
public class dupsimple {
    
    public static void main(String[] args) {
        int a[]={1,3,4,2,2};
        Arrays.sort(a);
        for(int i=0;i<a.length-1 ; i++)
        {
            if(a[i]==a[i+1])
            {
                System.out.println("duplicate element=" + " "+ a[i]);
            }
        }
    }
}

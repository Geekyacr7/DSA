
public class missing {
 public static void main(String[] args) {
     
    int a[]={1,2,3,5};
    for(int i=0;i<a.length;i++)
    {
        int index=Math.abs(a[i])-1;
        int value=a[index];
        if  (value>0)
{
        a[index]=a[index]*-1;

        }
        else 
        {
            System.out.println("missing element"+ (value-1));
        }
    }
 }   
}

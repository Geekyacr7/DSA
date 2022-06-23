
public class arraysecond {
    public static void main(String args[]) {

        int a [] ={10,2,34,56,12,20};
        int sl=-1, max=-1;

        for (int i=0; i<a.length;i++)
        {
            if (a[i]> max)
            {
                sl=max;
                max=a[i];
            }
            if(a[i]!=max)
            {
                if(a[i]>sl)
                {
                    sl=a[i];
                }
            }
        }
        System.out.println("first largest "+ max);
        System.out.println("Second largest "+ sl);
    }
}

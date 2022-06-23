public class freqsum {
    public static void main(String[] args) {
        int a[]={2,3,1,6,5,1};
        int sum=5;
        int c_sum=0;
        int high=0;
        int count=0;
        int c=0;
        for (int i=0;i<a.length;i++)
        {
            c_sum=0;
            high=i;
            while(high<a.length)
            {
                c_sum=c_sum +a[high];
                //System.out.print(c_sum + "  ");
                if(c_sum==sum)
                {
                    c++;
                }
                high++;
            }
            
           
        }
        System.out.println("THE FREQ OF THE SUM is" + "  "+ c);
    }
}

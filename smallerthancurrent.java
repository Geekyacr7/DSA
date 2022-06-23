public class smallerthancurrent {
    
    public static void main(String[] args) {
        
        int h=0;
        int c=-1;
        int nums[]={8,1,2,2,3};
        for (int i=0;i<nums.length;i++)
        {
            c=0;
            h=0;
            while( h<nums.length)
            {
                if (nums[i]>nums[h])
                {
                    c++;
                }
               
                h++;
              
    } System.out.println(c);
}
}
}
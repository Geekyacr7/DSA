public class summatch {
    

   
        public static void main(String[] args) {
            int a[]={6,5,2,3,4,1};
            int k=3;
            int sum=0,findsum=8;
           
            for (int i=0;i<k;i++)
            {
                sum+=a[i];
            
            }
            for (int i=k;i<a.length;i++)
            {int j=i;
                sum+=a[i]-a[i-k];
               if(sum==findsum)
               {
                   while(j<k+i)
                   {
                   System.out.print(a[j-k+1]+ "  ");
                   j++;
               }}
              
        }
   
        
    }
    }
    

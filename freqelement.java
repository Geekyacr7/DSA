public class freqelement {

        public static void main(String[] args) {
            int a[]={5,2,3,2,5,6,2};
            int ele=2;
            int temp=0;
            int high=0;
            int count=0;
            int k=3;
        
            for (int i=0;i<=a.length-k;i++)
            {
                temp=0;
                high=i;
                while(high<k+i)
                {
                  temp=a[high];
                    if(temp==ele)
                    {
                        count++;
                    }
                    high++;
                }
                
                System.out.println("THE FREQ OF element in"+ a[i] +"is" + "  "+ count);
                count=0;
            }
           
        }
    }
    
    


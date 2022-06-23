
public class dupremove {
    
    public static void main(String[] args) {
        int a[]={1,3,4,2,2};
       
        for(int i=0;i<a.length; i++){
            int index =Math.abs(a[i])-1;
            int value =a[index];
            if (value<0)
            {
                System.out.println("Duplicate"+ " "+ (index+1));
            }
                else
                {
                    a[index]=a[index]* -1;
                
            }}
        }
    }
        
public class thirdlarge {
    public static void main(String[] args) {
        
        int a []={8,2,4,10,7};
        int max=a[0],sl=a[0],tl=a[0];
        for (int i=0;i< a.length;i++)
        
        {if(a[i]>max){
        
            sl=max;
            max=a[i];
           
        }
        if (a[i]!=max) 
        {
            if(a[i]>sl)
        {
            tl=sl;
    
            sl=a[i];
        }
        }
        else if( a[i]!=sl  && a[i]!=max )
        {
            if (a[i]> tl)
            {
                tl= a[i];
            }
            
       
        }}
      System.out.println("third largest="+ " "+tl);}
    

}



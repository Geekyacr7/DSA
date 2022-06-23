public class raintrap {
    public static void main(String[] args) {
        int bar[]={0,1,0,2,1,0,1,3,2,1,2,1};
        int lbarmax[]=new int[bar.length];
        int rbarmax[]=new int[bar.length];
        lbarmax[0]=bar[0];
        for ( int i=1;i<lbarmax.length;i++)
        {
            lbarmax[i]= Math.max(lbarmax[i-1],bar[i]);
        }
      

        rbarmax[rbarmax.length-1]=bar[bar.length-1];
        for ( int i=rbarmax.length-2;i>=0;i--)
        {
            rbarmax[i]= Math.max(rbarmax[i+1],bar[i]);
        }
        
        int amwater=0;
        for ( int i=0; i<bar.length;i++)
        {
            int currentpillar=bar[i];
            int barheightmin =Math.min(lbarmax[i],rbarmax[i]);
            if(barheightmin >currentpillar )
            {
                amwater+= (barheightmin - currentpillar) ;
            }
        }
        System.out.println("UNITS OF WATER STORED+" + " "+ amwater);
    }
    
}  

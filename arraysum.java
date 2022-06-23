public class arraysum {
    public static void main(String[] args) {
        int a[]={10,20,30,40,50,60,70,80,90,100};
        int prefixsum[]=new int[a.length];
        prefixsum[0]=a[0];
        for (int i=1;i<prefixsum.length;i++)
        {
            prefixsum[i]= prefixsum[i-1]+ a[i];
        }
        for (int ele:prefixsum)
        { 
            System.out.print( "PREFIXSUM"+ "  "+ ele);

        }
        System.out.println();
        int lr=2;
        int ur=6;
        if (lr==0)
        {
            System.out.print("RANGE SUM"+ "  "+prefixsum[ur]);
        }
        System.out.println("RANGE SUM"+ "  "+ (prefixsum[ur]-prefixsum[lr-1]));


int ar[]={90,10,20,100,60,200,20,200,300,500};
int prefixmax[]=new int[ar.length];
prefixmax[0]=ar[0];
        for (int i=1;i<ar.length;i++)
        {
            prefixmax[i]= Math.max(prefixmax[i-1],ar[i]);
        }
        for (int ele:prefixmax)
        { 
            System.out.print( "max  "+ ele);

        }
        System.out.println();
}
}

public class arrayaddition {
    public static void main(String[] args) {
        
        int f[]={ 2,1,3,6};
        int s[]= {2,3,6,8};
        int t[]= new int[f.length> s.length ? f.length: s.length];
        int i=f.length-1;
        int j=s.length-1;
        int k =f.length-1;

        int carry =0;
        while (i>=0|| j>=0)
        {
            int digsum= carry;
            if (i>=0)
            {
            digsum+=f[i];
        }
        if (j>=0)
        {
        digsum+=s[i];
    }
    carry =digsum/10;
    digsum=digsum%10;
    t[k]= digsum;
    i--;
    j--;
    k--;
}
if ( carry>0)
{
    System.out.print(carry);
}
for (int e: t){
    System.out.print(e);
}

    }
    
}


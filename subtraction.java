public class subtraction{
    public static void main(String[] args) {
        int f[]={6,3,0,9};
        int s[]={5,6,2,9};
        int sub[]=new int[f.length>s.length? f.length:s.length];
int i=f.length-1;
int j=s.length-1;
int k=sub.length-1;
        while(i>0|| j>0)
        {
            if(f[i]<s[j]){
        sub[k]=f[i]+10-s[j];
        f[i-1]=f[i-1]-1;
       
            }
            else
            {
                sub[k]=f[i]-s[j];
            }
            i--;
            j--;
            k--;
        }
        for(int e:sub){
        System.out.print(" "+e);
    }
}
}
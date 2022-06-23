public class maxsumsubarray {
    public static void main(String[] args) {
        int a[]={-5,4,6,-3,4,-1};
        int k=3;
        int sum=0,maxsum=0;
        int p=0;
        for (int i=0;i<k;i++)
        {
            sum+=a[i];
            p=sum;
        }
        for (int i=k;i<a.length;i++)
        {
            sum+=a[i]-a[i-k];
            //q=sum;
            maxsum=(int)Math.max(p, sum);
            p=sum;
          
    }
    System.out.println(maxsum);
    
}
}

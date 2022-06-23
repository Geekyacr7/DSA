public class zigzag {
    public static void main(String[] args) {
        
        int a[]={4,3,7,8,6,2,1};
        for(int i=1;i<a.length;i+=2)
        {
            if(a[i]<a[i-1]){
                swap(a,i,i-1);
            }
            if(a[i]<a[i+1]){
                swap(a,i,i+1);
            }
        }
        for(int ele: a)
        {
            System.out.println(ele + "  ");
        }
    }
    static void swap(int a[],int l ,int b)
    {
        int temp=a[l];
       a[l]= a[b];
       a[b]=temp;
    }
}

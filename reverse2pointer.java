public class reverse2pointer {
    public static void main(String[] args) {
        int a []={2,4,1,6,7,9,0};
        int temp=0;
        int i=0,j=a.length-1;
        while(i<j)
        {
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
        for(int ele: a){
            System.out.println(ele);
        }
    }
    
}

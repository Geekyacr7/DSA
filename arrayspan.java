public class arrayspan {
    public static void main(String[] args) {
        int arr[]={2,5,7,4,6,9};
        int min= arr[0];
        int max=arr[0];
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]>max)
            {
                max=arr[i];
            }
            if(arr[i]<min){
                {
                    min=arr[i];
                }
                
            };
        } 
        System.out.println("SPAN =" + "   "+(max-min) );
    }
}


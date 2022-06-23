public class majorityelement {
    public static void main(String[] args) {
        int arr[]={1,1,2,2,2,2,3,4,5,3,3,3,3,3,3,3,3,3};
        int majorityelement=0;
        int majoritycount=arr.length/2;
int count=0;
        for(int i=0;i<arr.length;i++)
        {
                if (count==0)
                {
                    majorityelement=arr[i];
                }
        
        if(majorityelement==arr[i]){
            count++;

        
    }
    else{
        count--;
    }
    
}
count=0;
for(int e:arr)
{
    if (e==majorityelement)
    {
        count++;
    }
}
System.out.println(count>majoritycount? "Majority element" +"   "+ majorityelement: "no majority element");
    }
    }

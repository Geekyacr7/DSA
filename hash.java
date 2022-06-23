import java.util.Arrays;
import java.util.HashMap;
public class  hash{

    public static void main(String args[])
     {
    int a[]={2,9,6,3,1,20,4};
    int sum=9;
    HashMap<Integer,Integer> map=new HashMap<>();
    for (int i= 0;i< a.length;i++){
        int k= sum -a[i];
        if (map.get(a[i])== null)
        {
            map.put(k,i);
        }
        else{
            System.out.println(" Pair found "+ " "+map.get(a[i])+ " index " + " "+ i);
        }
    }
}
}
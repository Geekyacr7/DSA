import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class leader{
public static void main(String args[]) {
    

        int max =-1;
        int a[]={16,17,4,3,5,2};
        ArrayList <Integer> leaderlist=new ArrayList<>();
        for (int i=a.length-1;i>=0;i--){
            if (a[i]>=max)
            {
                max=a[i];
                leaderlist.add(max);
            }
        }
        Collections.reverse(leaderlist);
        System.out.println(leaderlist);
            }
        }
        
    

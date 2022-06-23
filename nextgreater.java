import java.util.Arrays;
import java.util.Stack;
public class nextgreater {
    public static void main(String[] args) {
        
        int a[]={20,7,5,14,16};
        int out[]=new int[a.length];
        Arrays.fill(out,-1);
        Stack<Integer>stack =new Stack<>();
        stack.push(0);
        for(int i=0; i<a.length;i++)
        {
            int index= stack.peek();
            if(a[index]>=a[i]){
                stack.push(i);
            }
            else{
                while(a[stack.peek()]< a[i])
                {
                    out[stack.peek()]= a[i];
                    stack.pop();
                }stack.push(i);
            }

        }
        for (int ele : out)
        System.out.print(ele+ "  ");
    }
}

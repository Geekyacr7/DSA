

public class reversestring {
    public static void main(String[] args) {
        String s="COMPUTER IS  FUN";
        s=" "+ s;  
        int n=s.length();
        String st="";
        for (int i= n-1;i>=0;i--)
        {
            
            if (s.charAt(i)==' ')
            {
                System.out.print( st+ " ");
                st="";
            }
            else
            {
            
            st=s.charAt(i)+st;
        }
    }
}
}

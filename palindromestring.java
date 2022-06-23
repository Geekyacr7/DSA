public class palindromestring {
    public static void main(String[] args) {
        String name="nitin";
        int i=0;
        int  j=name.length()-1;
        while(i<j)
        {
            if(name.charAt(i)!=name.charAt(j))
            {
                System.out.println("NOT PALINDROME");
                    return;
            }
           
            i++;
            j--;
        }
        System.out.println(" PALINDROME");
            
    }
}

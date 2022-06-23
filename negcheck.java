import java.util.Scanner;

public class negcheck {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter  order ");
        int m =sc.nextInt();
        int n=sc.nextInt();
        int a [][]=new int[m][n];
        System.out.println("Enter  Array ");
        for (int i=0;i<a.length;i++)
        { for (int j=0;j<a[i].length;j++)
            {
            a[i][j]=sc.nextInt();
            }
        }

        System.out.println("array elements are");
        for (int i=0;i<a.length;i++)
        {for (int j=0;j<a[i].length;j++)
            {
                if(a[i][j]<= 0)
           System.out.println(a[i][j]);
           
        }
} sc.close();
}
}


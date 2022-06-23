public class rowmajor {
    public static void main(String[] args) {
        
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("***ROW MAJOR WISE****");

        for (int i=0;i<a.length;i++){

            for (int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        System.out.println("***COLUMN MAJOR WISE****");

        for (int i=0;i<a.length;i++){

            for (int j=0;j<a[i].length;j++)
            {
                System.out.println(a[j][i]);
            }   
            System.out.println();
        }
    }
}
 
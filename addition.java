public class addition {
    public static void main(String[] args) {
        
        int a[][]={{2,1},{4,5}};
        int b[][]={{2,1},{3,2}};
        int c[][]=new int[2][2];
        
        System.out.println("***ADDITION****");
 
        for (int i=0;i<a.length;i++){

            for (int j=0;j<a[i].length;j++)
            {
                c[i][j]=a[i][j]+ b[i][j];
            }
        }
            for(int i=0;i< c.length;i++)
            {
                for (int j=0;j<c[i].length;j++){
            System.out.print(c[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
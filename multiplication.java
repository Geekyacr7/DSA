public class multiplication {
    public static void main(String[] args) {
        
        int a[][]={{2,1},{4,5}};
        int b[][]={{2,1},{3,2}};
        int c[][]=new int[2][2];
   

        System.out.println("***Multiplication****");
 
        for (int i=0;i<2;i++){

            for (int j=0;j<2;j++)
            {
                for (int k=0;k<2;k++)
            {
                c[i][j]+=a[i][k]*b[k][j];
            }
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

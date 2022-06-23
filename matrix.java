public class matrix {
    
    public static void main(String[] args) {
        int a[][]= {{1,2,7},{3,4,8},{7,0,5}};
        for (int i=0;i<a.length;i++){

            for (int j=0;j<a[i].length;j++)
            {
              System.out.print(a[i][j] + " ");
}System.out.println();
        }
       
        System.out.println("********Transposed matrix********");
        
        for (int i=0;i<a.length;i++){

            for (int j=0;j<a[i].length;j++)
            {
              System.out.print(a[j][i] + " ");
}
System.out.println();
        }
    }
}
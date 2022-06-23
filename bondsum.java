import javax.lang.model.util.ElementScanner14;

public class bondsum {
    public static void main(String[] args) {
        int ar[][]={{1,2,3,4},{5,6,7,8},{2,0,1,4},{2,0,2,1}};
        int ub=0;int lb=0;
        int d=0;

        for (int i=0;i<ar.length;i++)
        {
            for (int j=0;j<ar[i].length;j++)
            {
                if(i<j)
                {
                    ub+=ar[i][j];
                }
                else if( j<i)
                {
                    lb+=ar[i][j];
                }
                else
                {
                    d+=ar[i][j];
                }
            }
        }
        System.out.println((ub+d )+"  "+(lb+d));
    }
}

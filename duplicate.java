 public class duplicate {
    
    public static void main(String args[])
    {
        int num[]={5,5,1,1,1,2,2,3,3};
        int j= 0;
        for(int i=1;i< num.length;i++){
            if (num[j]!=num[i]){
                j++;
                num[j]=num[i];
                System.out.print(num[j] + "   ");
            }
            
            
        }System.out.println("length   " + j++);
    }

}


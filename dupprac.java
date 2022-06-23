 class dupprac {
    
    public static void main(String[]  args)
    {
        int num[]={0,0,1,1,1,2,2,3,3};
      int i;
        int j= 0;
        for( i=1;i< num.length;i++){
            if (num[j]!=num[i]){
                j++;
                num[j]=num[i];
             
            }

        }
      
           System.out.println(num[i]);
    

}
 }


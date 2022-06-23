public class gasstation {
    public static void main(String[] args) {
        int gas[]={1,2,3,4,5};
        int cost[]={3,4,5,1,2};
        int surplus =0,deficit=0;int startpt=0;
            for (int i=0;i<gas.length;i++)
            {
                surplus= deficit+= gas[i]- cost[i];

                if (surplus<0)
                {
                     surplus=0;
                    startpt++;
                }
            }

                if (deficit>=0)
                {
                    System.out.println("the starting point="+ "   " + startpt);
                }
                else {
                    System.out.println("NO station found");
                }
                }
            }


    


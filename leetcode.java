import java.util.HashMap;

 class leetcode {
    public static int  compress (char [] chars) {
        HashMap<Character,Integer > map = new HashMap<>();

        for(char c:chars){
            if(map.get(c)==null)
            {
                map.put(c,1);

            }
            else{
                int count =map.get(c);
                count++;
                map.put(c,count);
            }
        } 
        for(Character key :map.keySet())
        {
      //  return( map.get(key));
        return map.size()* 2;
    }
}
        public static void main(String[] args) {
            char chars[]={'a','a','a','b','b','c','c','c','c'};
            
            int e =compress(chars);
            System.out.println(e);
        }
    }
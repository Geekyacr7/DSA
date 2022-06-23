public class stringbuilderdemo {
    public static void main(String[] args) {
        String n="BOOB";
        StringBuilder sb=new StringBuilder(n);
        sb.reverse();
        System.out.println(sb.toString().equals(n) ? "PAlindrome" : "NOT palindome");
    }
}

package practice;

public class String {
    public static void main(String[] args) {

        // String
        String s = "Hello";
        s = s + " Java";
        System.out.println(s);

        // StringBuilder
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" Java");
        System.out.println(sb);

        // StringBuffer
        StringBuffer sf = new StringBuffer("Hello");
        sf.append(" Java");
        System.out.println(sf);
    }
}
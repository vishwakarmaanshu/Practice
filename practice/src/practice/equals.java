package practice;
public class equals {
    public static void main(String[] args) {
        // 1. String literals (String Pool)
        String s1 = "Java";
        String s2 = "Java";
        System.out.println(s1 == s2);        // true
        // 2. new keyword (heap object)
        String s3 = new String("Java");
        System.out.println(s1 == s3);        // false
        System.out.println(s1.equals(s3));   // true
        // 3. intern() brings it back to the pool
        System.out.println(s1 == s3.intern()); // true
        // 4. Integer cache trap (-128 to 127)
        Integer a = 127, b = 127;
        System.out.println(a == b);          // true
        Integer c = 128, d = 128;
        System.out.println(c == d);          // false 😱
        System.out.println(c.equals(d));     // true
    }
}
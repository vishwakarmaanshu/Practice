package practice;

public class String_immutable {

    public static void main(String[] args) {

        String str = "Hi";

        System.out.println("Original String: " + str);

        str.concat(" World");

        System.out.println("After concat(): " + str);

        str = str.concat(" World");

        System.out.println("After reassignment: " + str);
    }
}
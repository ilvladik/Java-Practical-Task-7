package Strings;

public class Tester {

    public static void main(String[] args) {
        StringProcess ps = new StringProcess();
        String str = "Hello World!";
        System.out.println(ps.size(str));
        System.out.println(ps.odd(str));
        System.out.println(ps.reverse(str));
    }
}

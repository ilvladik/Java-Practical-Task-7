package Strings;

public class StringProcess implements StringProcessable {

    @Override
    public int size(String str) {
        return str.length();
    }

    @Override
    public String odd(String str) {
        String newString = "";
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 1) {
                newString = newString + str.charAt(i);
            }
        }
        return newString;
    }

    @Override
    public String reverse(String str) {
        String newString = "";
        for (int i = str.length()-1; i >= 0; i--) {
            newString = newString + str.charAt(i);
        }
        return newString;
    }
}

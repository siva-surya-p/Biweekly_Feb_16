// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(shortestPalindrome("abacd"));
    }
    public static String shortestPalindrome(String s) {
        int len = s.length();
        StringBuilder reve = new StringBuilder(s);
        String rev = reve.reverse().toString();
        for (int i = 0; i < len; i++) {
            if (s.substring(0, len - i).equals(rev.substring(i))) return new StringBuilder(rev.substring(0, i)).append(s).toString();
        }
        return "";
    }
}

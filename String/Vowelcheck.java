package String;

public class Vowelcheck {
    public static void main(String[] args) {
        String s = "shrutika";
        char ch;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if ((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u')) {
                System.out.println(ch);
                count++;
            }
        }
        System.out.println("total no. of vowel:" + count);

    }

}

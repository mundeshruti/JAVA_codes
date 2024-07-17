package String;

public class Vowelcheck {
     public static void main(String[] args) {
        String s = "SHrutikA";
        int count = 0;
        int countc = 0;
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if ((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u') || (ch == 'A') || (ch == 'E')
                    || (ch == 'I') || (ch == 'O') || (ch == 'U')) {
                count++;
                System.out.println("vowel:" + ch);

            } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                System.out.println("consonent:" + ch);
                countc++;

            }
        }
        System.out.println("No.of vowels:" + count);
        System.out.println("No.of consonent:" + countc);

    }

}

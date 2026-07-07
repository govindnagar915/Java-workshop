//WAP to check whether a character is uppercase or lowercase.
public class CaseCheck {
    public static void main(String[] args) {
        char ch = 'G';

        if (ch >= 'A' && ch <= 'Z')
            System.out.println("Uppercase");
        else if (ch >= 'a' && ch <= 'z')
            System.out.println("Lowercase");
    }
}
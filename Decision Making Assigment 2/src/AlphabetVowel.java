//WAP to check if a character is an alphabet and then further check if it’s a vowel.
public class AlphabetVowel {
    public static void main(String[] args) {
        char ch = 'E';

        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {

            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
                ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                System.out.println("Vowel");
            else
                System.out.println("Consonant");

        } else {
            System.out.println("Not an Alphabet");
        }
    }
}

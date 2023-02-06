import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // accepting input from the user
        String character = sc.next();
        
        // checking whether entered character is vowel or not
        // using isVowel(String) method of Vowel class
        if(Vowel.isVowel(character)) {
            System.out.println("Vowel");
        } else {
            System.out.println("NOT a vowel");
        }

        // closing resource
        sc.close();
    }
}

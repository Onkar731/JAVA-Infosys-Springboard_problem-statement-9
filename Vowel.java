public class Vowel {
    public static boolean isVowel(String vowel) {
        String vowels = "aeiou";

        if(vowels.indexOf(vowel) != -1) {
            return true;
        } else {
            return false;
        }
    }
}
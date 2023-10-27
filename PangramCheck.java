public class PangramCheck {
    public static boolean isPangram(String sentence) {
        sentence = sentence.toLowerCase();
        boolean[] alphabetArray = new boolean[26];

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);

            if (c >= 'a' && c <= 'z') {
                alphabetArray[c - 'a'] = true;
            }
        }

        for (boolean isPresent : alphabetArray) {
            if (!isPresent) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String inputSentence = "The quick brown fox jumps over the lazy dog"; // Replace with your input sentence
        if (isPangram(inputSentence)) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}

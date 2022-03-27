public class S_CaesarChiper {
    //penerapan String program caesar chiper
    public static void main(String[] args) {
        //The Caesar cipher
        // variable initialization
        String s = " blackholesarewheregoddividedbyzero";
        System.out.printf("Original mesaage:%s\n", s);
        String message = "";
        int shift = 1;
        //converent from string to charArray
        char arrayStr[] = s.toCharArray();

        //loop iterating over characters
        for (char c : arrayStr) {
            int i = (int) c;
            i += shift;
            if (i > ((int) 'z')) {
                i -= 26;
            }
            char newChar = (char) i;
            message += newChar;
        }
        //printing
        System.out.printf("Encrypted message: %s\n", message);
    }
}

public class R_vowelConsonant {
    public static void main(String[] args) {
        //penerapam String menghitung jumlah huruf konsonan dan vocal

        //Character occurrence in a sentence analysis
        //the string that we want to analyze
        String s = " A programmer gets stuck in the shower because the intructions on the shampoo were:lather,wash,and repeat.";
        System.out.println(s);
        s = s.toLowerCase();

//counters initialization
        int vowelCount = 0;
        int conconantCount = 0;

//definition of character groups
        String vowels = "aeiouy";
        String consonants = "bcdfghjklmnpqrstvwxz";

//convert from string to charArray
        char c[] = s.toCharArray();

// main loop
        for (int i = 0; i < c.length; i++) {
            if (vowels.contains(String.valueOf(c[i]))) {
                vowelCount++;
            } else if (consonants.contains(String.valueOf(c[i]))) {
                conconantCount++;
            }
        }
        System.out.printf("Vowels:%d\n", vowelCount);
        System.out.printf("Consonants: %d\n", conconantCount);
        System.out.printf("Other characters: %d\n", (c.length - (vowelCount + conconantCount)));
    }
}
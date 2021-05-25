package task1_ShortestLongestWord;

public class ShortLongWord {
    public static String findMaxWord(String word1, String word2) {
        if (word1.length() < word2.length()) {
            return word2;
        } else {
            return word1;
        }
    }

    public static String findMinWord(String word1, String word2) {
        if (word1.length() > word2.length()) {
            return word2;
        } else {
            return word1;
        }
    }
}

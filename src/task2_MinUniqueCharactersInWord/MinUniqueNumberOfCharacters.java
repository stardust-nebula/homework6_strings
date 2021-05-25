package task2_MinUniqueCharactersInWord;

public class MinUniqueNumberOfCharacters {
    public static int getLengthOfWord(String word) {

        StringBuffer lineWithUniqueCharacters = new StringBuffer();
        String currentCharacterInLine;
        for (int i = 0; i < word.length(); i++) {
            currentCharacterInLine = String.valueOf(word.charAt(i));
            if (lineWithUniqueCharacters.indexOf(currentCharacterInLine) == -1) {
                lineWithUniqueCharacters.append(currentCharacterInLine);
            }
        }
        return lineWithUniqueCharacters.length();
    }


    public static String getWordWithMinUniqueCharacters(String word1, String word2) {
        String minWord;
        if (getLengthOfWord(word1) < getLengthOfWord(word2)) {
            minWord = word1;
        } else {
            minWord = word2;
        }
        return minWord;

    }
}

package task3_isPalindrom;

public class CheckPalindrom {


    public static boolean isPalindrom(String word) {
        StringBuilder checkedWord = new StringBuilder(word);
        String wordReversed = String.valueOf(checkedWord.reverse());
        boolean isPalindrom = false;
        if (word.equalsIgnoreCase(wordReversed)) {
            isPalindrom = true;
        } else isPalindrom = false;
        return isPalindrom;
    }

    public static String getWordByIndexFromText(int index, String[] textArray) {
        String wordByIndex = textArray[index];
        return wordByIndex;
    }

    public static boolean isIndexExist(int index, String[] textArray) {
        if (index >= 0 && index < textArray.length) {
            return true;
        } else {
            return false;
        }
    }


}

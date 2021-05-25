package task1_ShortestLongestWord;



/**
 * В данной программе происходит поиск самого короткого и самого длинного слова.
 */
public class Task1_Runner {

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // Для теста и/или работы использую готовую строку
        String text = "Дана строка произвольной длины с произвольными словами";
        String[] words = text.split(" ");

        String maxWordLength = words[0];
        for (int i = 0; i < words.length - 1; i++) {
            maxWordLength = ShortLongWord.findMaxWord(maxWordLength, words[i]);
        }
        System.out.println("Самое длиное слово: " + maxWordLength);


        String minWordLength = words[0];
        for (int i = 0; i < words.length - 1; i++) {
            minWordLength = ShortLongWord.findMinWord(minWordLength, words[i]);
        }
        System.out.println("Самое короткое слово: " + minWordLength);

    }
}

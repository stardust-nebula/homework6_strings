package task2_MinUniqueCharactersInWord;

/**
 * Поиск слова, в котором есть минимальноче число уникальных символов
 */

public class Task2_Runner {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // ДЛя теста использую готовую строку
        String text = "fffff ab f 1234 jkjk"; // sc.nextLine();
        String[] words = text.split(" ");

        String wordWithMinUniqueCharacters = words[0];
        for (int i = 0; i < words.length-1; i++){
            wordWithMinUniqueCharacters = MinUniqueNumberOfCharacters.getWordWithMinUniqueCharacters(wordWithMinUniqueCharacters, words[i]);
        }

        System.out.println("Слово, в котором число различных символов минимально: " + wordWithMinUniqueCharacters);











    }
}

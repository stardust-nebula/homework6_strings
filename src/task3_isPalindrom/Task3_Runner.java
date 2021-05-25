package task3_isPalindrom;

import java.util.Scanner;

/**
 * Проверка является ли указзаное слова (по индексу) палиндромом.
 */


public class Task3_Runner {

    public static void main(String[] args) {
        String text = "Дом мод на другой улице";
        String[] words = text.split(" ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите индекс для поиска слова.");
        int wordIndex = sc.nextInt();

        if (CheckPalindrom.isIndexExist(wordIndex, words)) {
            String wordByIndex = CheckPalindrom.getWordByIndexFromText(wordIndex, words);
            if (CheckPalindrom.isPalindrom(wordByIndex)) {
                System.out.println("Слово: " + wordByIndex + " по индексу: " + wordIndex + " является палиндромом.");
            } else {
                System.out.println("Слово: " + wordByIndex + " по индексу: " + wordIndex + " является палиндромом.");
            }
        } else {
            System.out.println("Нет слова по такому индексу");
        }
    }
}

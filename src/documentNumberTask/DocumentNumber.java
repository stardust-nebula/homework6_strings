package documentNumberTask;

import java.util.Locale;

public class DocumentNumber {


    public static void showNumberFromFirstTwoBlocks(String str) {
        // Вывести на экран в одну строку два первых блока по 4 цифры
        for (int i = 0; i < 13; i++) {
            if (Character.isDigit(str.charAt(i))) {
                System.out.print(str.charAt(i));
            }
        }
        System.out.println("\n");
    }


    public static void replaceLetterStar(String str) {
        // Вывести на экран номер документа, но блоки из трех букв заменить на *(каждая буква заменятся на *)

        for (int i = 0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i))) {
                System.out.print("*");
            } else {
                System.out.print(str.charAt(i));
            }
        }
        System.out.println("\n");

    }

    public static void showOnlyLettersSpecFormatLowerCase(String str) {
        // Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре
        StringBuilder resultLetterFormatWithoutLabel = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i))) {
                resultLetterFormatWithoutLabel.append(Character.toLowerCase(str.charAt(i)));
            }
        }
        resultLetterFormatWithoutLabel.insert(3, "/");
        resultLetterFormatWithoutLabel.insert(7, "/");
        resultLetterFormatWithoutLabel.insert(9, "/");

        System.out.println(resultLetterFormatWithoutLabel);
        System.out.println();


    }

    public static void showOnlyLettersSpecFormatUpperCaseLabeled(String str) {
        // Вывести на экран буквы из номера документа в формате Letters:yyy/yyy/y/y в верхнем регистре(реализовать с помощью класса StringBuilder)

        String label = "Letters: ";
        StringBuilder resultLetterUpperCase = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i))) {
                resultLetterUpperCase.append(Character.toUpperCase(str.charAt(i)));
            }
        }
        resultLetterUpperCase.insert(3, "/");
        resultLetterUpperCase.insert(7, "/");
        resultLetterUpperCase.insert(9, "/");

        System.out.println(label + resultLetterUpperCase);
        System.out.println();

    }


    public static void isNewSequenceExistInExisting(String str, String newSeq) {
        // Проверить содержит ли номер документа последовательность abc и вывести сообщение содержит или нет(причем, abc и ABC считается одинаковой последовательностью).

        // Привела строку к .toLowerCase для любого случая (abc, ABC) чтобы проверять не учитывая регистр для букв.
        String strLowerCase = str.toLowerCase();
        String newSeqLowerCase = newSeq.toLowerCase();


        if (newSeqLowerCase == "abc" || newSeqLowerCase == "555") {

            if (strLowerCase.contains(newSeqLowerCase)) {
                System.out.println("Подстрока " + newSeq + " входит в " + str + " (не учитывая регистр для букв)");
            } else {
                System.out.println("Подстрока " + newSeq + " не входит в " + str + " (не учитывая регистр для букв)");
                System.out.println();

            }
        } else {
            System.out.println("По заданию должна быть другая строка для сравнения с номером документа.");
        }

    }


    public static void isDocNumberEndsOnEnteredSeq(String str, String newSeq) {
        // Проверить заканчивается ли номер документа на последовательность 1a2b.

        // Привела строку к .toLowerCase для случаев с буквами, чтобы проверять не учитывая регистр.
        String strLowerCase = str.toLowerCase();
        String newSeqLowerCase = newSeq.toLowerCase();

        if (strLowerCase.endsWith(newSeqLowerCase)) {
            System.out.println(str + " номер документа содержит " + newSeq + " (не учитывая регистр для букв)");
        } else {
            System.out.println(str + " номер документа не содержит " + newSeq + " (не учитывая регистр для букв)");
        }

    }

}








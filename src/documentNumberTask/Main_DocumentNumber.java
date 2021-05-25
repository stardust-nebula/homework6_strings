package documentNumberTask;

import java.util.Scanner;


/**
 * Программа, в которой происходит работа с номером документа.
 */

public class Main_DocumentNumber {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер документа в формате xxxx-yyy-xxxx-yyy-xyxy, где x - это число, а y - это буква. Например, 3652-abc-9047-mLv-5F7y.");
        String docNumber = sc.nextLine();


        System.out.println("- Вывести на экран в одну строку два первых блока по 4 цифры");
        DocumentNumber.showNumberFromFirstTwoBlocks(docNumber);

        System.out.println("- Вывести на экран номер документа, но блоки из трех букв заменить на *(каждая буква заменятся на *)");
        DocumentNumber.replaceLetterStar(docNumber);

        System.out.println("- Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре");
        DocumentNumber.showOnlyLettersSpecFormatLowerCase(docNumber);

        System.out.println("- Вывести на экран буквы из номера документа в формате Letters:yyy/yyy/y/y в верхнем регистре(реализовать с помощью класса StringBuilder)");
        DocumentNumber.showOnlyLettersSpecFormatUpperCaseLabeled(docNumber);

        System.out.println("- Проверить содержит ли номер документа последовательность abc и вывести сообщение содержит или нет(причем, abc и ABC считается одинаковой последовательностью).");
        System.out.println("Введите \"ABC\" или \"abc\" строку для сравнения с номером документа.");
        String sequence1_toCheck = sc.nextLine();
        DocumentNumber.isNewSequenceExistInExisting(docNumber, sequence1_toCheck);


        System.out.println("Проверить начинается ли номер документа с последовательности 555.");
        String sequence2_toCheck = "555";
        DocumentNumber.isNewSequenceExistInExisting(docNumber, sequence2_toCheck);


        System.out.println("- Проверить заканчивается ли номер документа на последовательность 1a2b.");
        String sequence3_toCheck = "1a2b";
        DocumentNumber.isDocNumberEndsOnEnteredSeq(docNumber, sequence3_toCheck);

    }
}

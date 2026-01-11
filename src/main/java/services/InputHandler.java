package services;

import java.util.Scanner;

public class InputHandler {

    public static int menuChoice()  {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) {
            System.out.println("Ошибка: нужно ввести целое число!");
            scanner.next();
            return menuChoice();
        }
        return scanner.nextInt();
    }
}

package utils;

import java.util.Scanner;

public class InputHandler {

    public static int getIntInput()  {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) {
            System.out.println("Ошибка: нужно ввести целое число!");
            scanner.next();
            return getIntInput();
        }
        return scanner.nextInt();
    }
}

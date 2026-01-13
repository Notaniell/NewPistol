package services;

import java.util.Random;
import java.util.Scanner;

import static components.Magazine.MAX_BULLETS;

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

    public static int getRandomForBarrel() {
        Random random = new Random();
        return random.nextInt(MAX_BULLETS);
    }
}

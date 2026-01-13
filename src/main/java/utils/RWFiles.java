package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class RWFiles {
    public static final String REMAIN_BULLETS = "RemainBullets.txt";

    public static int readIntFromFile() {
        File file = new File(REMAIN_BULLETS);

        try (Scanner scanner = new Scanner(file)) {

            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            }

            System.out.println("Файл не содержит целых чисел");

        } catch (FileNotFoundException e) {
            System.out.println("Ошибка доступа к файлу");
        }

        return 0;
    }

    public static void writeToFile (int currentBullets){
        try (FileWriter writer = new FileWriter(REMAIN_BULLETS)) {

            writer.write(Integer.toString(currentBullets));
        } catch (Exception e) {
            System.out.println("Ошибка записи файла");
        }

    }

}

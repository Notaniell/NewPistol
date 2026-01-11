package services;

import components.Magazine;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class RWFiles {
    public static final String REMAIN_BULLETS = "RemainBullets.txt";

    public static void readFromFile(Magazine magazine) {
        File file = new File(REMAIN_BULLETS);
        try (Scanner scanner = new Scanner(file)) {
            if (!scanner.hasNextInt()) {
                System.out.println("Файл не содержит целых чисел");
                return;
        }
        magazine.setCurrentBullets(scanner.nextInt());
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка доступа к файлу");
        }
    }

    public static void writeToFile (Magazine magazine){
        try (FileWriter writer = new FileWriter(REMAIN_BULLETS)) {
            writer.write(Integer.toString(magazine.getCurrentBullets()));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

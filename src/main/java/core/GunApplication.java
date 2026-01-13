package core;

import model.Magazine;
import utils.InputHandler;
import utils.MenuShow;
import utils.RWFiles;

public class GunApplication {
    public void run(){
        Pistol pistol = new Pistol();
        Magazine magazine = new Magazine();
        magazine.setCurrentBullets(RWFiles.readIntFromFile());
        
        while (true) {
            MenuShow.showMainMenu();
            int choice = InputHandler.getIntInput();

            switch (choice) {
                case 1 -> {
                    System.out.println("Сколько патронов заряжаем?");
                    magazine.setCurrentBullets(InputHandler.getIntInput());
                }
                case 2 -> pistol.shoot(magazine);
                case 3 -> System.out.println("Патронов осталось: " + magazine.getCurrentBullets());
                case 4 -> {
                    if(RussianRoll.getResultSpinBarrel(magazine)) {
                        pistol.shoot(magazine);
                        continue;
                    }
                    System.out.println("Повезло, повезло, в каморе пусто");
                }
                case 5 -> {
                    RWFiles.writeToFile(magazine.getCurrentBullets());
                    return;
                }
                default -> throw new IllegalStateException("Некорректный ввод: " + choice);
            }
        }
    }
}
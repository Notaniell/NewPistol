package app;

import components.Magazine;
import services.InputHandler;
import services.MenuShow;
import services.RWFiles;

public class GunApplication {
    public void run(){
        Pistol pistol = new Pistol();
        Magazine magazine = new Magazine();
        RWFiles.readFromFile(magazine);
        
        while (true) {
            MenuShow.showMainMenu();
            int choice = InputHandler.menuChoice();

            switch (choice) {   // весь этот блок как будто просится поближе к меню..
                case 1 -> {
                    System.out.println("\nСколько патронов заряжаем?");  // временно, нужно будет менять, с проверкой на валидность
                    magazine.setCurrentBullets(InputHandler.menuChoice());  //  не уверен что так вообще стоит делать
                }
                case 2 -> pistol.shoot(magazine);
                case 3 -> System.out.println("\nПатронов осталось: " + magazine.getCurrentBullets());
                case 4 -> {
                    MenuShow.showRussianRollMenu();
                }  // временно
                case 5 -> {
                    RWFiles.writeToFile(magazine);
                    return;
                }
                default -> throw new IllegalStateException("Некорректный ввод: " + choice);
            }
        }
    }
}

//        System.out.println("\n1. Зарядить патроны");
//        System.out.println("2. Выстрелить");
//        System.out.println("3. Количество патронов в магазине");
//        System.out.println("4. Русская рулетка");
//        System.out.println("5. Выйти");
//    }
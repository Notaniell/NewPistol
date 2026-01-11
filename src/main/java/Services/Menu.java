package Services;

public class Menu {
    public static void showMainMenu(){
        System.out.println("1. Зарядить патроны");
        System.out.println("2. Выстрелить");
        System.out.println("3. Количество патронов в магазине");
        System.out.println("4. Русская рулетка");
        System.out.println("5. Выйти");
    }


    public void showRussianRollMenu() {
        System.out.println("1. Крутим барабан!");
        System.out.println("2. Выстрелить!!!(\u001B[31mОПАСНО!!!\u001B[0m)");
    }
}

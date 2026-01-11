import App.GunApplication;
import Services.Menu;

public class Main {
    public static void main(String[] args) {
        GunApplication revolver = new GunApplication();
        revolver.run();

        Menu test = new Menu();
        test.showRussianRollMenu();
    }
}

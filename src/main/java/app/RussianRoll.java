package app;

import components.Magazine;
import services.InputHandler;

public class RussianRoll {
    public static boolean resultSpinBarrel(Magazine magazine){
        boolean[] boolArray = magazine.getBulletsInBarrel();
        return boolArray[InputHandler.getRandomForBarrel()];
    }
}

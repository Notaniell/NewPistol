package core;

import model.Magazine;
import utils.RandomHelper;

public class RussianRoll {
    public static boolean getResultSpinBarrel(Magazine magazine){
        boolean[] boolArray = magazine.getBulletsInBarrel();
        return boolArray[RandomHelper.getRandomForBarrel()];
    }
}

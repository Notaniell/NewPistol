package utils;

import model.Magazine;

public class RussianRollUtil {
    public static boolean getResultSpinBarrel(Magazine magazine){
        boolean[] boolArray = magazine.getBulletsInBarrel(); //  так понимаю тут крайне желательно тоже как то
        return boolArray[RandomHelperUtil.getRandomForBarrel()]; //  убрать связность, + утилитарный класс по идеи
    }
}

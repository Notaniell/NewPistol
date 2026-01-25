package utils;

import java.util.Random;

import static model.Magazine.MAX_BULLETS;

public class RandomHelperUtil {
    public static int getRandomForBarrel() {
        Random random = new Random();
        return random.nextInt(MAX_BULLETS);
    }
}

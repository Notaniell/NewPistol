package model;

import java.util.Arrays;

public class Magazine {
    public static final int MAX_BULLETS = 6;

    private boolean[] bulletsInBarrel = new boolean[MAX_BULLETS];

    public int getCurrentBullets() {
        int count = 0;
        for (boolean value : this.bulletsInBarrel) {
            if (value) {
                count++;
            }
        }
        return count;
    }

    public void setCurrentBullets(int inputBullets) {
        Arrays.fill(this.bulletsInBarrel, false); // обнуляем патроны
        for (int i = 0;i < inputBullets  && i < MAX_BULLETS;i++) {
            this.bulletsInBarrel[i] = true;
        }
    }

    public void decreaseCurrentBullet() {
        for (int i = 0;i < MAX_BULLETS;i++){
            int b = MAX_BULLETS - 1 - i;

            if (this.bulletsInBarrel[b]) {
                this.bulletsInBarrel[b] = false;
                return;
            }
        }
    }

    public boolean[] getBulletsInBarrel() {
        return this.bulletsInBarrel;
    }
}

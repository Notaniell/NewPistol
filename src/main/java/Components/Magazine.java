package Components;

public class Magazine {
    private final int MAX_BULLETS = 6;
    private int currentBullets = 0;

//    boolean[] barrel = new boolean[MAX_BULLETS];

    public int getCurrentBullets() {
        return currentBullets;
    }

    public void setCurrentBullets(int inputBullets) {
        currentBullets = inputBullets;
//        for (int i = 0;i < inputBullets;i++){
//            barrel[i] = true;
//        }
    }

    public void decreaseCurrentBullet() {
        currentBullets--;
    }

}

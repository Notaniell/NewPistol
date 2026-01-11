package App;

import Components.Magazine;

public class Pistol {
    private Magazine magazine;

    public Pistol(){
        this.magazine = new Magazine();
    }
    public void shoot(){
        if(magazine.getCurrentBullets() > 0) {
            magazine.decreaseCurrentBullet();
            System.out.println("Бах!!!");
            return;
        }
        System.out.println("Клац...Нет патрона");
    }
}

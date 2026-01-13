package core;

import model.Magazine;

public class Pistol {

    public void shoot(Magazine magazine){
        if(magazine.getCurrentBullets() > 0) {
            magazine.decreaseCurrentBullet();
            System.out.println("Бах!!!");
            return;
        }
        System.out.println("Клац...Нет патрона");
    }
}

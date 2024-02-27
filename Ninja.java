package com.ug7.soal2;

public class Ninja extends Karakter{
    private boolean isAbilityReady;
    public Ninja(String username, String password) {
        super(username, password);

    

    public Ninja(String username, int level, int money, int HP, int weapon, boolean isWalk, boolean isAbilityReady) {
        super(username, level, money, HP, weapon, isWalk);
        this.isAbilityReady = isAbilityReady;
    }
    public void abilityAttack(Player Karakter) {
        if (isAbilityReady && Karakter.() < 50) {
            int damage = Karakter.();
            Karakter.(damage);
        }
    }

    public void normalAttack(Player Karakter) {
        if (isWalk) {
            int damage = Karakter.getHP();
            Karakter.reduceHP(damage);
        } else {
            int damage = Karakter.getHP() / 2;
            Karakter.reduceHP(damage);
        }
    }
    public void walk(boolean type) {
        super.walk(type);
        if (type) {
            System.out.println("Menghilang");
        }
    }

}

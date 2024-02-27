package com.ug7.soal2;

public class Karakter extends Player {
    private String username;
    private String password;
    private int level;
    private int HP;
    private int money;
    private int weapon;
    private boolean isWalking;

    public Karakter(String username, String password) {
        this.username = username;
        this.password = password;
        this.level = 1;
        this.HP = 100;
        this.money = 5000;
        this.weapon = 0;
        this.isWalking = false;
        public void levelUp() {
            level++;
        }

        public void buyWeapon(int weaponId) {
            weapon = weaponId;
        }

        public void abilityAttack(Karakter) {

            throw new UnsupportedOperationException("");
        }

        public void normalAttack(Karakter ) {

            throw new UnsupportedOperationException("Not implemented in base class");
        }

        public void walk(boolean isWalking) {
            this.isWalking = isWalking;
        }

        public String getInfo() {
            return String.format("Username: %s\nLevel: %d\nHP: %d\nMoney: %d\nWeapon: %d\nWalking: %s",
                    username, level, HP, money, weapon, isWalking ? "Yes" : "No");
        }
    }

}

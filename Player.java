package com.ug7.soal2;

public class Player {
    private String username;
    private String password;
    private int level = 1;
    private  int money;
    private int HP;
    private int weapon;
    private boolean isWalk;

    public Player(String username, String password) {
        this.username = username;
        this.password = password;
        this.level = level;
        this.money = money;
        this.HP = HP;
        this.weapon = weapon;
        this.isWalk = isWalk;

    }

    public Player(boolean isWalk) {
        this.isWalk = isWalk;
    }

    public void levelUp() {
        level++;
    }
    public void buyWeapon(int weapon) {

    }

    }

    public void abilityAttack(Player character) {

    }

    public void normalAttack(Player character) {

    }

    public void walk(boolean type) {

    }

    public void getInfo() {
        System.out.println("Username: " + username);
        System.out.println("Level: " + level);
        System.out.println("Money: " + money);
        System.out.println("HP: " + HP);
        System.out.println("Weapon: " + getWeaponName());
        System.out.println("Movement: " + (isWalk ? "Running" : "Walking"));
    }

    private String getWeaponName() {
        switch (weapon) {
            case 0:
                return "Tangan kosong";
            case 1:
                return "Pisau";
            case 2:
                return "Tongkat Sihir";
            case 3:
                return "Tongkat";
            case 4:
                return "Katana";
            default:
                return "Senjata tidak dikenal";
        }
    public String getUsername() {
        return username;
    }

    public void levelUp() {
        this.level += 1;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getLevel() {
        return level;
    }

}

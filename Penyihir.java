package com.ug7.soal2;

public class Penyihir extends Karakter{
    private boolean isAbilityReady;

    public Penyihir(String username, int level, int money, int HP, int weapon, boolean isWalk, boolean isAbilityReady) {
        super(username, level, money, HP, weapon, isWalk);
        this.isAbilityReady = isAbilityReady;
    }

    @Override
    public void abilityAttack(Player character) {
        if (isAbilityReady) {
            if (isWalk) {
                int healAmount = character.getMaxHP() / 2;
                character.heal(healAmount);
            } else {
                character.heal(character.getMaxHP());
            }
        }
    }

    @Override
    public void normalAttack(Player Karakter) {

    }

    @Override
    public void walk(boolean type) {
        super.walk(type);
        if (type) {
            System.out.println("Terbang");
        }
    }
}

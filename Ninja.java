package com.ug7.soal2;

public class Ninja class extend Player{
    private boolean isAbilityReady;
    public Ninja(String username,int level,int money,int HP, int weapon, boolean isWalk, boolean isAbilityReady){
        super(username,level,money,HP,weapon,isWalk);
        this.isAbilityReady = isAbilityReady;
    }

}

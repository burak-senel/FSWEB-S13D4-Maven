package org.example;

public enum Weapon {
    SWORD(50, 1.2),
    AXE(60, 0.9),
    BOW(30, 1.5),
    DAGGER(25, 2.0);
    private int damage;
    private double attackSpeed;
    public int getDamage() {
        return this.damage;
    }
    public double getAttackSpeed() {
        return this.attackSpeed;
    }
    private Weapon(int damage,double attackSpeed){
        this.damage=damage;
        this.attackSpeed=attackSpeed;
    }
}

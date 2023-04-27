package Task4;

import java.util.Random;

public class Warrior<T extends Weapon, S extends Shield> extends Person {
    protected T weapon;
    protected S shield;
    protected static Random rand = new Random();

    public Warrior(String name, int hp, T weapon, S shield) {
        super(name, hp);
        this.weapon = weapon;
        this.shield = shield;
    }

    public int harm() {
        boolean isHit = rand.nextBoolean();
        int damage = 0;
        if (isHit) {
            damage = rand.nextInt(weapon.damage()+1);
        }
        return damage;
    }

    public int defend(int damage) {
        int reduction = rand.nextInt(shield.getDefense() + 1);
        return Math.max(0, damage - reduction);
    }

    @Override
    public String toString() {
        return "Warrior{" +
                " name = " + getName() +
                " hp = " + getHp() +
                " weapon = " + weapon +
                " shield = " + shield +
                '}';
    }

}

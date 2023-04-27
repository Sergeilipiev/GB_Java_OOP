package Task4;

public class Battle {
    private Warrior attacker;
    private Warrior defender;

    public Battle(Warrior attacker, Warrior definder) {
        this.attacker = attacker;
        this.defender = definder;
    }
    public Warrior run(){
        while (true){
            int attack = attacker.harm();
            defender.reduceHp(attacker.harm() - defender.defend(attacker.harm()));
            System.out.printf("Warrior %s give harm %d\n Warrior %s %d HP\n", attacker.getName(), attack, defender.getName(), defender.getHp());
            if (!defender.isAlive()) {
                System.out.printf("Warrior %s is dead, %s winner", defender.getName(), attacker.getName());
                return attacker;
            }
            attack = defender.harm();
            attacker.reduceHp(defender.harm() - attacker.defend(defender.harm()));
            System.out.printf("Warrior %s return harm %d\n Warrior %s %d HP\n", defender.getName(), attack, attacker.getName(), attacker.getHp());
            if (!attacker.isAlive()) {
                System.out.printf("Warrior %s is dead, %s winner", attacker.getName(), defender.getName());
                return defender;
            }
        }
    }
}

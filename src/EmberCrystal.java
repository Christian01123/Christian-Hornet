public class EmberCrystal extends Relic {
    public EmberCrystal() {
        super("Ember Crystal", "Increase attack by 2");
    }

    @Override
    public int modifyAttack(int baseDamage, BattleContext context) {
        return baseDamage + 2;
    }
}

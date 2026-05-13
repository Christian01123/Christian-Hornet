public class Shaw extends Relic {
    public Shaw() {
        super("Shaw", "???");
    }

    @Override
    public int modifyAttack(int baseDamage, BattleContext context) {
        return baseDamage + 10;
    }
}

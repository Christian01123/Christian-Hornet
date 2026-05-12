public class Silkheart extends Gambit {
    public Silkheart() {
        super("Silkheart", "???", 3);
    }

    @Override
    public void activate(BattleContext context) {
        // Make sure the gambit is marked as activated
        super.activate(context);
    }

    @Override
    public int modifyAttack(int baseDamage, BattleContext context) {
        if (isActivated()) {
            return baseDamage + 20;
        }
        return baseDamage;
    }
}
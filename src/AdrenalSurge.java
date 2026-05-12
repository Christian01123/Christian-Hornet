public class AdrenalSurge extends Gambit {
    public AdrenalSurge() {
        super("Adrenal Surge", "Gain extra attack temporarily", 3);
    }

    @Override
    public void activate(BattleContext context) {
        // Make sure the gambit is marked as activated
        super.activate(context);
    }

    @Override
    public int modifyAttack(int baseDamage, BattleContext context) {
        if (isActivated()) {
            return baseDamage + 5;
        }
        return baseDamage;
    }
}
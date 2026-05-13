public class ShadeLord extends Gambit {
    public ShadeLord() {
        super("Shade", "???", 100);
    }

    @Override
    public void activate(BattleContext context) {
        // Make sure the gambit is marked as activated
        super.activate(context);
    }

    @Override
    public int modifyHealing(int baseDamage, BattleContext context) {
        if (isActivated()) {
            return baseDamage * -20;
        }
        return baseDamage;
    }
    
}

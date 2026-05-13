public class DeepFocus extends Tactic {
    public DeepFocus() {
        super("Deep Focus", "???");
    }

    @Override
    public int modifyHealing(int baseDamage, BattleContext context) {
        return baseDamage * -15;
    }
    
}

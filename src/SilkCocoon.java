public class SilkCocoon extends Tactic {
    public SilkCocoon() {
        super("Silk Cocoon", "???");
    }

    @Override
    public int modifyHealing(int baseHeal, BattleContext context) {
        return baseHeal + 10;
    }
}
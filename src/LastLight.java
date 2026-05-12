public class LastLight extends Tactic {
    public LastLight() {
        super("Last Light", "Boosts healing or grants a defensive bonus");
    }

    @Override
    public int modifyHealing(int baseHeal, BattleContext context) {
        return baseHeal + 3;
    }
}
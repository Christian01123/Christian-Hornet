public class Radiance extends Relic{
    public Radiance() {
        super("Radiance", "???");
    }

    @Override
    public int modifyAttack(int baseDamage, BattleContext context) {
        return baseDamage - 10;
    }
}

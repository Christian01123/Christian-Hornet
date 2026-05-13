public class Adino extends Action {
    public Adino() {
        super("Adino", 0);
    }

    @Override
public void execute(BattleContext context) {
    // Get the attacker's stats
    int damage = context.wielder.getAttackPower() + 10;
    
    // Apply damage to the enemy
    context.enemy.takeDamage(damage, context);
    
}
}
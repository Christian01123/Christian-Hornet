public class NeedleStrike extends Action {
    public NeedleStrike() {
        super("Needle Strike", 0);
    }

    @Override
public void execute(BattleContext context) {
    // Get the attacker's stats
    int damage = context.wielder.getAttackPower() + 5;
    
    // Apply damage to the enemy
    context.enemy.takeDamage(damage, context);
    
    // Log what happened (optional)
    context.getLog().addActionEntry(context.wielder, context.enemy, 
        "Needle Strike", "Dealt " + damage + " damage", context.round);
}
}

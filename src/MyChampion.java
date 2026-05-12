import java.util.List;
import java.util.ArrayList;

/**
 * Your champion. Change the class name, the name field, and make it yours!
 */
public class MyChampion extends Champion {
    public static final String NAME = "Hornet";


    public MyChampion() {
        // Create a champion with an attack of 8, a defense of 2, and max health of 70
        super("Hornet", 8, 2, 70);
    }

    @Override
    public List<Action> getActions() {
        List<Action> actions = new ArrayList<>(super.getActions());  // Include any defaults
        actions.add(new NeedleStrike());  // Add your custom action
        return actions;
    }

    @Override
    public Loadout getLoadout() {
        Loadout loadout = new Loadout();  // Start with empty loadout
        loadout.swapRelic(new EmberCrystal());     // Equip Ember Crystal for +2 attack
        loadout.swapTactic(new LastLight());       // Equip Last Light for healing boost
        loadout.swapPocketedGambit(new Silkheart());  // Equip Adrenal Surge gambit
        return loadout;
    }
}

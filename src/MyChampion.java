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
        return super.getActions();
    }
}

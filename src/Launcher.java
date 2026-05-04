public class Launcher {
    public static void main(String[] args) throws Exception {
        // Delegate to the real ChampionsArena
        ChampionsArena.main(args);
        MyChampion hornet = new MyChampion();
    }
}

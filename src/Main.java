public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Gökhan Saki", 13, 100, 110, 33);
        Fighter f2 = new Fighter("Tyrone Spong", 12, 105, 110, 30);

        Match match = new Match(f1, f2, 100, 120);
        match.run();

    }
}
public class App {
    public static void main(String[] args) {
        System.out.println("Mijn App");
    }

    private static void doStuff() {
        System.out.println("App.doStuff calles by featureY & featureZ");
    }

    private static void featureY() {
        doStuff();
    }

    private static void featureZ() {
        doStuff();
    }
}

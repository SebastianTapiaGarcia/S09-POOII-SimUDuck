public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.volar(); // Vuela normalmente (FlyWithWings)

        // ¡El pato consigue un jetpack!
        mallard.setFlyBehavior(new FlyWithJetpack());
        mallard.volar(); // Ahora vuela con jetpack

        // Cambio a "no volar" (por ejemplo, se agota el combustible)
        mallard.setFlyBehavior(new FlyNoWay());
        mallard.volar(); // No vuela
    }
}

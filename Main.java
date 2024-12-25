public class Main {
    public static void main(String[] args) {
        Cow wagyu = new Cow();
        wagyu.sound();

        Duck donald = new Duck("Donald");
        Duck daisy = new Duck("Daisy");
        donald.sound();

        Pig burin = new Pig();
        burin.sound();

        Owl hedwig = new Owl();
        hedwig.sound();
    
        donald.clean(wagyu);
        daisy.clean(donald);

        PekingDuck fourseasons = new PekingDuck("4ss");
        fourseasons.clean(daisy);
        fourseasons.fly();

        donald.clean(new Cow());
    }
}

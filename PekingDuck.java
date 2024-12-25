public class PekingDuck extends Duck {
    
    PekingDuck(String name) {
        super(name);
    }

    @Override
    public void clean(Animal animal) {
        System.out.println("I'm died bro");
    }
}

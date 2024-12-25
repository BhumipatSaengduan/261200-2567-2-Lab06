public class Owl extends Animal implements Flyable {
    
    @Override
    void sound() {
        System.out.println("Hoot");
    }

    @Override
    public void fly() {
        System.out.println("Hoot fly!");
    }   

    @Override   
    public void glide() {
        System.out.println("Hoot glide!");
    }
}
public class Duck extends Animal implements Flyable {
    String name;
    
    public Duck(String name) {
        this.name = name;
    }

    public String toString() {
        return "Duck" + this.name;
    }

    @Override
    void sound() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("prbbb prbbb");
    }   

    @Override   
    public void glide() {
        System.out.println("hi-yahhh!");
    }

    public void clean(Animal animal){
        System.out.println(this.toString() + " is cleaning " + animal.toString() + ".");
    }
}

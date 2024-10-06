interface Animial {
    void eat();
    void sleep();
}

abstract class Mammal implements Animial {
    @Override
    public void sleep() {
        System.out.println(this.getClass().getSimpleName() + " спит.");
    }

    public abstract void walk();
}

class Lion extends Mammal {

    @Override
    public void eat() {
        System.out.println("Лев кушает.");
    }
    @Override
    public void walk() {
        System.out.println("Лев идет.");
    }
}

class Elephant extends Mammal {
    @Override
    public void eat() {
        System.out.println("Слоняра кушает.");
    }

    @Override
    public void walk() {
        System.out.println("Слоняра идет.");
    }
}

public class Animals {
    public static void main(String[] args) {
        Mammal lion = new Lion();
        Mammal elephant = new Elephant();

        lion.walk();
        lion.eat();
        lion.sleep();

        elephant.walk();
        elephant.eat();
        elephant.sleep();
    }
}
interface Product {
    double getPrice();
    String getName();
}

abstract class PhysicalProduct implements Product {
    private double price;
    private String name;

    public PhysicalProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
    @Override
    public String getName() {
        return name;
    }

    abstract double getWeight();
}

class Book extends PhysicalProduct {
    private double weight;

    public Book(String name, double price, double weight) {
        super(name, price);
        this.weight = weight;
    }

    @Override
    double getWeight() {
        return weight;
    }
}

class Software implements Product {
    private double price;
    private String name;

    public Software(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
    @Override
    public String getName() {
        return name;
    }
}

public class Shop {
    public static void main(String[] args) {

        Product book = new Book("JavaTraining", 29.99, 1.5);
        Product software = new Software("IntelliJ IDEA", 199.99);

        System.out.println("Товар: " + book.getName() + ", Цена: " + book.getPrice() + " USD, Вес: " + ((Book) book).getWeight() + " кг");
        System.out.println("Товар: " + software.getName() + ", Цена: " + software.getPrice() + " USD");
    }
}

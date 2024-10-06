interface Device {
    void turnOn();
    void turnOff();
}

abstract class ElectronicDevice implements Device {
    @Override
    public void turnOn() {
        System.out.println("Девайс включён.");
    }

    @Override
    public void turnOff() {
        System.out.println("Девайс отключён.");
    }

    abstract int getPowerConsumption();
}

class TV extends ElectronicDevice {
    private int powerConsumption;

    public TV(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    @Override
    public void turnOn() {
        System.out.println("Телевизор запустился.");
    }

    @Override
    public void turnOff() {
        System.out.println("Телевизор отключен.");
    }

    @Override
    int getPowerConsumption() {
        return powerConsumption;
    }
}

class Computer extends ElectronicDevice {
    private int powerConsumption;

    public Computer(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    @Override
    public void turnOn() {
        System.out.println("Компьютер запустился.");
    }

    @Override
    public void turnOff() {
        System.out.println("Компьютер отключен.");
    }

    @Override
    int getPowerConsumption() {
        return powerConsumption;
    }
}

public class Devices {
    public static void main(String[] args) {
        ElectronicDevice tv = new TV(150); // Изменено на ElectronicDevice
        ElectronicDevice computer = new Computer(500); // Изменено на ElectronicDevice

        tv.turnOn();
        System.out.println("Потребляемая мощность телевизора: " + tv.getPowerConsumption() + " Вт");
        tv.turnOff();

        computer.turnOn();
        System.out.println("Потребляемая мощность компьютера: " + computer.getPowerConsumption() + " Вт");
        computer.turnOff();
    }
}
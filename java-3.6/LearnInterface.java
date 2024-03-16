public class LearnInterface {
    public static void main(String[] args) {
        // Car car = new Car("Toyota", 2022);
        // car.track();
        // car.drive();
        // car.stop();
        // car.honk();

        // MobilePhone phone = new MobilePhone("iPhone 14");
        // phone.track();

        Car car = new Car("Toyota");
        car.track();
        car.drive();
        car.stop();
        car.fill();
        car.getFuelLevel();

        ElectricCar electricCar = new ElectricCar("Tesla");
        electricCar.track();
        electricCar.drive();
        electricCar.stop();
        electricCar.charge();
        electricCar.getCharge();

        MobilePhone phone = new MobilePhone();
        phone.charge();
        phone.getCharge();

        RCCar rcCar = new RCCar();
        rcCar.drive();
        rcCar.stop();
        rcCar.charge();
        rcCar.getCharge();
    }
}

interface Trackable {
    void track();
}

interface Drivable {
    void drive();
    void stop();

    // Java 8 onwards -- default method
    default void honk() {
        System.out.println("Honk!");
    }
}

interface FuelTank {
    void fill();
    double getFuelLevel();
}

interface BatteryPack {
    void charge();
    double getCharge();
}

abstract class Vehicle implements Trackable, Drivable {
    protected String make;

    public Vehicle(){};

    public Vehicle(String make) {
        this.make = make;
    }
}

class ElectricCar extends Vehicle implements BatteryPack{
    double batteryCharge;

    ElectricCar(String make) {
        super(make);
        batteryCharge = 0;
    }

    @Override
    public void track() {
        System.out.println("Tracking...");
    }

    @Override
    public void drive() {
        System.out.println("driving...");
    }

    @Override
    public void stop() {
        System.out.println("stopping...");
    }

    @Override
    public void charge() {
        System.out.println("Charging");
        batteryCharge = 100;
    }

    @Override
    public double getCharge() {
        return batteryCharge;
    }

}

class Car extends Vehicle implements FuelTank{

    private String name;
    private double fuelLevel;

    public Car(){}

    public Car(String name) {
        this.name = name;
        this.fuelLevel = 0;
    }

    @Override
    public void track() {
        System.out.println("Tracking car " + this.name + ".");
    }

    @Override
    public void drive() {
        System.out.println("Driving car...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping car...");
    }

    @Override
    public void fill() {
        this.fuelLevel = 100;
    }

    @Override
    public double getFuelLevel() {
        return fuelLevel;
    }

}

class RCCar implements Drivable, BatteryPack {
    double batteryLevel;

    RCCar() {
        batteryLevel = 0;
    }

    @Override
    public void charge() {
        batteryLevel = 100;
    }

    @Override
    public double getCharge() {
        return batteryLevel;
    }

    @Override
    public void drive() {
        System.out.println("zip zip...");
    }

    @Override
    public void stop() {
        System.out.println("screeccchh....");
    }
    
}

class MobilePhone implements Trackable, BatteryPack {
    private String model;
    private double chargeLevel;

    public MobilePhone() {
        chargeLevel = 0;
    }

    public MobilePhone(String model) {
        this();
        this.model = model;
    }

    @Override
    public void track() {
        System.out.println("Tracking mobile phone " + this.model + ".");
    } 

    @Override
    public void charge() {
        this.chargeLevel = 100;
    }

    @Override
    public double getCharge() {
        return chargeLevel;
    }

}

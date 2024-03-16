
import mypackage.House;
import mypackage.Car;
public class MyApp {
    public static void main(String[] args) {
        // System.out.println("My App");
        // House myHouse = new House();
        // System.out.println(myHouse);
        // System.out.println(addNumbers(11,12));
    

        Car.aboutCar();
        Car myCar = new Car();
        myCar.startEngine();
        myCar.startAircon();
        myCar.startRadio();
    

    }
    
    public static int addNumbers(int a, int b){
        return a+b;
    }

    
}

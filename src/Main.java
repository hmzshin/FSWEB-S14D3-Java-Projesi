import com.s14d3.RandD.CarSkeleton;
import com.s14d3.RandD.ElectricCar;
import com.s14d3.RandD.GasPoweredCar;
import com.s14d3.pacific.Car;
import com.s14d3.pacific.Ford;
import com.s14d3.pacific.Holden;
import com.s14d3.pacific.Mitsubishi;

public class Main {
    public static void main(String[] args) {

        Car car = new Car(8, "Base car");

        System.out.println(car.startEngine());

        System.out.println(car.accelerate());

        System.out.println(car.carBreak());

        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");

        System.out.println(mitsubishi.startEngine());

        System.out.println(mitsubishi.accelerate());

        System.out.println(mitsubishi.carBreak());
        Car ford = new Ford(6, "com.s14d3.pacific.Ford Falcon");

        System.out.println(ford.startEngine());

        System.out.println(ford.accelerate());

        System.out.println(ford.carBreak());

        Car holden = new Holden(6, "com.s14d3.pacific.Holden Commodore");

        System.out.println(holden.startEngine());

        System.out.println(holden.accelerate());

        System.out.println(holden.carBreak());

        CarSkeleton astra = new GasPoweredCar("Astra", "C class car", 12.4, 4);
        CarSkeleton togg = new ElectricCar("T10X", "Suv class", 15, 10);
        CarSkeleton corolla = new GasPoweredCar("Corolla", "B class car", 10, 4);

        CarSkeleton[] cars = { astra, togg, corolla };

        for (CarSkeleton c : cars) {

            c.startEngine();
            // cars[i].runEngine();
        }

    }
}
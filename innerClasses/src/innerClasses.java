public class innerClasses {
    public static void main(String[] args) {
        //there are three versions of inner-classes
        Car car = new Car(999);
        Car.FuelTank fuelTank = new Car.FuelTank();
        car.startCar();
        fuelTank.fillTank();
    }
}

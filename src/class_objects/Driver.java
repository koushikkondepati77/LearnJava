package class_objects;

public class Driver {
    public static void main(String[] args){
        Car swiftCar = new Car();
        swiftCar.addFuel(6);
        swiftCar.start().drive();
        System.out.println(swiftCar.color);





    }
}

package class_objects;

public class Car {


    int noOfWheels;
    String color;
    float maxSpeed;
    int noOfSeats;
    float currentFuelInLitres;

    Car(String color){
        noOfWheels = 4;
        this.color = color;
        maxSpeed = 150;
        noOfSeats = 5;
        currentFuelInLitres = 2;
    }

    Car(){
        this("Black");
        currentFuelInLitres = 5;

    }

    public Car start(){
        if(currentFuelInLitres == 0){
            System.out.println("Car is out of fuel");
        } else if(currentFuelInLitres < 5){
            System.out.println("Car is in Reserved mode, pls refuel");
            currentFuelInLitres--;
        } else{
            System.out.println("Car is Started , bruhhhhh....");
        }

        return this;
    }

    public void drive(){
        currentFuelInLitres--;
        System.out.println("Car is Driving......");
    }

    public void addFuel(float currentFuelInLitres){
        this.currentFuelInLitres += currentFuelInLitres;
    }

    public float getCurrentFuelInLiters(){
        return this.currentFuelInLitres;
    }



}

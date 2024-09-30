package javaConstructors;
//constructor is a special method used to initialize objects
//it is called when an instance of class is created
//Unlike methods, constructors don't have the return type.
//there are two types of constructors default and parameterized
//name of the constructor is same as the name of the class

public class carConstructor {
    public static void main(String[] args) {
        Car car1 = new Car("ford", 2016);
        Car car2 = new Car();
        car1.display();
        car2.display();

    }
}

class Car{
    String model;
    int year;

    Car(String model, int year){
        this.model = model;
        this.year = year;
    }

    Car(){
        model = "unknown";
        year = 0;

    }



    void display(){
        System.out.println("car model :" + model + " year : " + year);
    }
}

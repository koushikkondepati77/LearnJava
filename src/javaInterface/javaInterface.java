package javaInterface;

//interface is the blueprint of class
//ex: interface Test
//ex: class Test
//super keyword is not applicable for interface
//super keyword is only applicable for class
//multiple parents is possible through interfaces
//interface contains final and static variables and abstract methods
//in interface the variables are by-default final and static, we no need to specify
//class extends another class
//interface extends another interface
//a class implements an interface
//in interface abstract, default and static methods are allowed from java 8 onwards
//by-default the methods in interface are public if nothing is specified


interface Shape{
    int length = 10; //By-default the variable are final and static
    int width = 20; //final and static

    void circle(); //abstract method

    default void square(){
        System.out.println("this is a square -- default method");
    }

    static void rectangle(){
        System.out.println("this is a rectangle -- static method");
    }
}


public class javaInterface implements Shape {

    public void circle(){
        System.out.println("this is a circle -- abstract method");
    }

    public static void main(String[] args) {


        //scenario 1
//        javaInterface idObj = new javaInterface();
//        idObj.circle(); //abstract
//        idObj.square(); //default
//        Shape.rectangle(); //static method can directly access from interface


        //scenario 2
//        Shape sh = new javaInterface();
//        sh.circle();
//        sh.square();
//        Shape.rectangle();

    }
}

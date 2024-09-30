package javaInheritance;
// final keyword can be used before variables, methods and classes
// method overriding is not possible if the parent method is having final keyword
// if the parent class is having fina
class Test1{
    int x = 100;
//    final int x = 100;
}

public class finalKeyword1 {
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.x = 200;
        System.out.println(test1.x);
    }

}

package javaInheritance;
//method overriding means same method definition but different method implementation
//overriding can be achieved only through inheritance


class Bank{
 double roi(){
     return 0;
 }
}

class ICICI extends Bank{
    double roi(){
        return 10.5;
    }
}

class SBI extends Bank{
    double roi(){
        return 11.5;
    }
}

public class methodOverridingDemo {
    public static void main(String[] args) {
        ICICI b1 = new ICICI();
        System.out.println(b1.roi());

        SBI b2 = new SBI();
        System.out.println(b2.roi());
    }
}

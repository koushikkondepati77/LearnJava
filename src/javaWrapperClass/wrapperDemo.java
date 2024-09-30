package javaWrapperClass;

//for any primitive data type there are wrapper classes available
// int -- Integer
// float -- Float
// double -- Double
// char -- Character
// boolean -- Boolean

//ex: Integer x = new Integer(10);

//we can also convert data from one format to other using wrapper classes

public class wrapperDemo {
    public static void main(String[] args) {

        //scenario 1
        // String -----> int,double,boolean,char
        // caution: we cannot convert string to char because string is a group of characters and char is a single character

        //step 1 of scenario 1
        // string to int

        //String s = "welcome"; // we cannot convert s into int
        String s = "1234"; //we can convert it into int
        int sint = Integer.parseInt(s);

        //scenario 2
        //int,double,boolean,char  --- String

        int a = 10;
        double b = 10.5;
        char c = 'A';
        boolean d = true;

        //any datatype - string
        //String.valueOf() --> convert all primitive dat types into string format

        String str = String.valueOf(a);
        System.out.println("integer to string : " + str);

        str = String.valueOf(b);
        System.out.println("double to string : " + str);

        str = String.valueOf(c);
        System.out.println("char to string : " + str);

        str = String.valueOf(d);
        System.out.println("integer to string : " + str);
    }
}

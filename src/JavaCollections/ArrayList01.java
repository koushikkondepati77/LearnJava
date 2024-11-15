package JavaCollections;
//ArrayList can be preffered if we have more number of retrieving operations
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList01 {
    public static void main(String[] args) {
        //default initial size of ArrayList is 10
        //ArrayList al = new ArrayList(); //object created with default constructor //accepts heterogenous data
        //ArrayList<Integer> al = new ArrayList<Integer>(); // allows us to store only integer datatype
        //Arraylist<String> al = new ArrayList<String>(); // accepts only string datatype
        //using wrapper classes we can restrict the dataType

        ArrayList al = new ArrayList();

        al.add(100);
        al.add("koushik");
        al.add(5.6);
        al.add(true);
        al.add(1999);
        al.add("koushik");

        System.out.println(al);
        al.remove(4);
        al.remove("koushik");
        al.add(1,2000);

        al.set(2,10.0);
        System.out.println(al.get(2));
        System.out.println(al.isEmpty());


        System.out.println(al);

        //reading elements using for loop
        System.out.println("reading elements using for loop");
//        for(int i = 0 ; i<al.size();i++){
//            System.out.println(al.get(i));
//        }

        //using for each loop
        System.out.println("reading elements using for each loop");
//        for(Object i:al){
//            System.out.println(i);
//        }

        //using iterator
        System.out.println("reading elements using Iterator Interface");
        Iterator it = al.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

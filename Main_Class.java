import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.*;

public class Main_Class
{
    public static void main(String [] args)
    {
        ClassA.printMe();

        /*
            Pass-By-Value
            Java only supprots passing by value not reference
            meaning that, any change or modification, wont
            change the original value passed
         */
        ClassA objA = new ClassA("Mohammed");
        objA.setProp1("Suhail");
        passByValue(objA);

        /*
            THREADING
         */
        resurrection order = new resurrection("Mohammed");
        Thread thread1 = new Thread(order);
        Thread thread2 = new Thread(new resurrection("Abdullah"));
        Thread thread3 = new Thread(new resurrection("Ahmed"));

        thread1.start();
        thread2.start();
        thread3.start();

        /*
            Iterator
         */
//            ArrayList<String> list = new ArrayList<String>();
//            list.add("Mohammed Fadin");
//            list.add("Abdullah Fadin");
//            list.add("Hussein Fadin");
//           iterateOverLists(list);

        /*
            Sorting
         */

        Sorting sortObject = new Sorting();
        int[] sortArray = new int[]{2,1,4,3};
        sortObject.insertionSort(sortArray);

    }

    public static void passByValue(ClassA prop1)
    {
        System.out.println(prop1.getProp1());

        prop1.setProp1("Mohammed Suhail Fadin");

        System.out.println(prop1.getProp1()); // Mohammed Suhail Fadin

        prop1 = new ClassA("Abdullah"); // new address memeory

        prop1.setProp1("Abdulaziz");

        System.out.println(prop1.getProp1()); // Abdulaziz
    }

    public static void iterateOverLists(ArrayList list)
    {
        Iterator itr = list.iterator();
        // Now we create the iterator to iterator

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}





class ClassA
{
    private String prop1;

    public ClassA(String prop1) {
        this.prop1 = prop1;
    }

    public String getProp1() {
        return prop1;
    }

    public void setProp1(String prop1) {
        this.prop1 = prop1;
    }

    //private int foo1 =10;
    // This is a non-static var, and
    // can only be accessed using an instance
    // Hence, cannot be inside a static-method

    // Static it's already there, binded
    // at the compile time
    public static void printMe()
    {
      // foo1 = 320;
        //System.out.println(foo1);
    }

    @Override
    public String toString() {
        return this.prop1;
    }
}

// Approach #1 for Threads
class TextReader extends Thread
{

}

// Approach #2 for threading

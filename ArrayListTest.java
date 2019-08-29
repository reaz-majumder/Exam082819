package OtherTest;


import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList city = new ArrayList();
        city.add("HongKong");
        city.add("Bangkok");

        System.out.println(city.get(1));
        System.out.println(city.size());
        for (Object cityNames:city) {
            System.out.println(cityNames);
        }
            ArrayList country = new ArrayList();
            country.add ("India");
            country.add ("Japan");

            Iterator iterator = country.iterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }

        }
    }


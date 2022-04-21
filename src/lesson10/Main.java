package lesson10;

import java.util.*;

public class Main {

    public static void main(String[] args) {


//        List<ArrayChild> cars = new ArrayList();
//
//        System.out.println(cars.isEmpty());
//        cars.add(new ArrayChild());
//        cars.add(new ArrayChild());
//        cars.add(new ArrayChild());
//        System.out.println(cars.isEmpty());
//        System.out.println(cars.size());


        ArrayList al = new ArrayList();
        System.out.println("initSize al = " + al.size());

        al.add("A");
        al.add("R");
        al.add("T");
        al.add("Y");
        al.add("E");
        al.add("J");
        al.add("I");
        al.add("N");
        al.add("Z");
        al.add("Q");

        System.out.println("afterAddingSize al = " + al.size());
        System.out.println("contentAl " + al);
    }

}

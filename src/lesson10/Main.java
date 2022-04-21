package lesson10;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<ArrayChild> cars = new ArrayList();

        System.out.println();
        System.out.println("init size = " + cars.size());

        System.out.println("collection cars is emty? - " + cars.isEmpty());

        ArrayChild lotus = new ArrayChild("Lotus");
        ArrayChild maserati = new ArrayChild("Maserati");
        ArrayChild lamborghini = new ArrayChild("Lamborghini");
        ArrayChild bugatti = new ArrayChild("Bugatti");
        ArrayChild ferrari = new ArrayChild("Ferrari");
        ArrayChild mcLaren = new ArrayChild("McLaren");
        ArrayChild mazzanti = new ArrayChild("Mazzanti");
        ArrayChild pagani = new ArrayChild("Pagani");
        ArrayChild saleen = new ArrayChild("Saleen");
        ArrayChild porsche = new ArrayChild("Porsche");

        cars.add(lotus);
        cars.add(maserati);
        cars.add(lamborghini);
        cars.add(bugatti);
        cars.add(ferrari);
        cars.add(mcLaren);
        cars.add(mazzanti);
        cars.add(pagani);
        cars.add(saleen);
        cars.add(porsche);


        System.out.println("size after adding elements = " + cars.size());

        System.out.println(cars.contains("Bugatti"));

        System.out.println("brand in index 3 is " + cars.get(3));

        ArrayChild mercedes = new ArrayChild("Mercedes");

        cars.set(9, mercedes);
        System.out.println("element 9 is " + cars.get(9));

        System.out.println("is sallen here? - " + cars.contains(saleen));

        List<ArrayChild> europianCars = new ArrayList();
        ArrayChild opel = new ArrayChild("Opel");
        europianCars.add(opel);

        europianCars.addAll(1, cars);
        System.out.println(europianCars);

        europianCars.remove(maserati);
        System.out.println("index of Lotus is " + cars.indexOf(lotus));

        System.out.println(Arrays.toString(cars.toArray()));

        System.out.println(cars.subList(7,9));

        ArrayList<Integer> digits = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        Spliterator<Integer> sItr = digits.spliterator();

        sItr.tryAdvance( d -> System.out.println( d ) );
        sItr.tryAdvance( d -> System.out.println( d ) );
        sItr.tryAdvance( d -> System.out.println( d ) );
        sItr.tryAdvance( d -> System.out.println( d ) );

        sItr.forEachRemaining( d -> System.out.println( d ) );
    }

}


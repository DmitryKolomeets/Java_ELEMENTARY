package lesson10;

import java.util.*;
import java.util.stream.Stream;

public class LinkedListMain {

    public static void main(String[] args) {

        List<MyLinkedList> pets = new LinkedList();


        System.out.println();
        System.out.println("init size = " + pets.size());

        System.out.println();
        System.out.println("collection cars is emty? - " + pets.isEmpty());

        MyLinkedList dog = new MyLinkedList("Cerber");
        MyLinkedList cat = new MyLinkedList("Tom");
        MyLinkedList mouse = new MyLinkedList("Jary");
        MyLinkedList bird = new MyLinkedList("Prometey");
        MyLinkedList fish = new MyLinkedList("Selesta");
        MyLinkedList horse = new MyLinkedList("Pinky");
        MyLinkedList snake = new MyLinkedList("Python");
        MyLinkedList squirrel = new MyLinkedList("Nut");
        MyLinkedList fox = new MyLinkedList("Red");


        pets.add(dog);
        pets.add(cat);
        pets.add(mouse);
        pets.add(bird);
        pets.add(fish);
        pets.add(horse);
        pets.add(snake);
        pets.add(squirrel);
        pets.add(fox);

        System.out.println();
        System.out.println(pets);

        ((LinkedList<MyLinkedList>) pets).removeLast();
        ((LinkedList<MyLinkedList>) pets).removeFirst();


        System.out.println(" \n collection after remove first and last = " + pets);

        pets.add(dog);
        pets.add(fox);

        System.out.println("\n" + pets);

        pets.remove(2);
        pets.remove(mouse);
        System.out.println(" \n collection after remove index #2 and mouse = " + pets);

        System.out.println(" \n pet with index 4 is = " + pets.get(4));  // index 4 ???

        ((LinkedList<MyLinkedList>) pets).removeFirst();
        ListIterator<MyLinkedList> myLinkedListListIterator = ((LinkedList<MyLinkedList>) pets).listIterator(3);

        System.out.println(((LinkedList<MyLinkedList>) pets).indexOf(dog));

        System.out.println(((LinkedList<MyLinkedList>) pets).getFirst());
        System.out.println(((LinkedList<MyLinkedList>) pets).getLast());

        System.out.println(((LinkedList<MyLinkedList>) pets).clone());

        MyLinkedList snail = new MyLinkedList("Speedy");
        MyLinkedList hamster = new MyLinkedList("FatBoy");

        ((LinkedList<MyLinkedList>) pets).addFirst(snail);
        ((LinkedList<MyLinkedList>) pets).addLast(hamster);

        System.out.println("\n" + pets);

        System.out.println("\n" + Arrays.toString(pets.toArray()));
    }
}

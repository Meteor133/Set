package pl_gornik;

import pl_gornik.Model.ComparatorBySurname;
import pl_gornik.Model.Person;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        Set<Integer> setHash = new HashSet<>();
        Set<Integer> setLinked = new LinkedHashSet<>();
        Set<Integer> setTree = new TreeSet<>();
        List<Integer> list = new ArrayList<>();

        Random random = new Random();
        int i =0;
        while (setHash.size() < 20) {
            int number = random.nextInt(100);
            setHash.add(number);
            setLinked.add(number);
            setTree.add(number);
            list.add(number);
            i++;

        }
        System.out.println("HashSet" + " " + setHash);
        System.out.println("SetLinked" + " " + setLinked);
        System.out.println("SetTree" + " " + setTree);

        List<Integer> list1 = new LinkedList<>(setLinked);
        System.out.println(list1);
        System.out.println(list1.get(3));

        System.out.println(setTree.size());
        System.out.println(setLinked.contains(4));
        System.out.println(setTree.containsAll(setHash));

        System.out.println("---------------------------------------------\n");

        ComparatorBySurname comp = new ComparatorBySurname();

        Set<Person> persons = new HashSet<>();
        Person person1 = new Person("Kojtek", "Wiecień", 43, "98051514352");
        Person person2 = new Person("Diktor", "Wiarek", 18, "78051514352");
        Person person3 = new Person("Kateusz", "Milarski", 23, "98051514352");
        Person person4 = new Person("Janek", "Kowalski", 33, "98053454352");
        Person person5 = new Person("Franek", "Nowak", 53, "98051514352");

        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);

        for (Person person: persons) System.out.println(person);

        System.out.println("---------------------------------------------\n");

        Set<Person> persons2 = new TreeSet<>(comp);
        persons2.add(person1);
        persons2.add(person2);
        persons2.add(person3);
        persons2.add(person4);
        persons2.add(person5);

        for (Person person: persons2) System.out.println(person);

        System.out.println("linijka");



    }

}
package collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        final Set<Integer> numbersSet = new HashSet<>();
        System.out.println(numbersSet.isEmpty());
        numbersSet.add(1);
        numbersSet.add(2);
        numbersSet.add(3);
        numbersSet.forEach(System.out::println);

        final Set<String> namesSet = new TreeSet<>();
        System.out.println(namesSet.isEmpty());
        namesSet.add("Zosia");
        namesSet.add("Ania");
        namesSet.add("Karol");
        namesSet.add("Zbigniew");
        namesSet.forEach(System.out::println);
        namesSet.remove("Ania");
        System.out.println();
        namesSet.forEach(System.out::println);
        System.out.println();

        final Set<Integer> numberSet = new LinkedHashSet<>();
        numberSet.add(2);
        numberSet.add(50);
        numberSet.add(1);
        numberSet.forEach(System.out::println);
        System.out.println();
        numberSet.clear();
        System.out.println(numberSet.isEmpty());

        System.out.println();
        final List<String> animals = new ArrayList<>();
        animals.add("dog");
        animals.add("cat");
        for (final String animal : animals){
            System.out.println(animal);
        }
        System.out.println();
        animals.add("duck"); // dodane na koniec listy
        for (final String animal : animals){
            System.out.println(animal);
        }

        final List<String> firstnames = new LinkedList<>();
        firstnames.add(0, "Krzysztof");
        firstnames.add(0, "Daniel"); // dodanie na początek kolejki
        firstnames.add(1,"Ala");
        for (final String firstname : firstnames){
            System.out.println(firstname);
        }

        System.out.println();
        final Queue<String> events = new LinkedList<>();
        events.offer("concert");
        events.offer("festival");
        System.out.println(events.element());
        System.out.println(events.peek());
        System.out.println(events.remove());
        for (final String event : events){
            System.out.println(event);
        }
        events.clear();
        System.out.println(events.isEmpty());
    }



}

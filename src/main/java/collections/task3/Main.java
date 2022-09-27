package collections.task3;

import java.util.*;

/*
Na podstawie 100 elementowej tablicy z losowo wybranymi wartościami z
przedziału 0-50 zaimplementuj następujące funkcjonalności:
zwróć listę unikalnych elementów
zwróć listę elementów, które conajmniej raz powtórzyły się w
wygenerowanej tablicy
 */
public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        List<Integer> values = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            values.add(random.nextInt(50));
        }
        Set<Integer> uniqueValues = new HashSet<>();
        Set<Integer> dupicatedValues = new HashSet<>();
        for (Integer value : values){
            if (!uniqueValues.add(value)) {
                dupicatedValues.add(value);
            }
        }
        System.out.println("Unique: " + uniqueValues);
        System.out.println("Dupicated: " + dupicatedValues);
    }
}

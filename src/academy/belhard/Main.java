package academy.belhard;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Brad", "Pitt", Gender.MALE);
        Person person2 = new Person("Julia", "Roberts", Gender.FEMALE);
        Person person3 = new Person("George", "Clooney", Gender.MALE);
        Person person4 = new Person("Matt", "Damon", Gender.MALE);
        Person person5 = new Person("Cate", "Blanchett", Gender.FEMALE);

        List<Person> personsList = new ArrayList<>();
        personsList.add(person1);
        personsList.add(person2);
        personsList.add(person3);
        personsList.add(person4);
        personsList.add(person5);

        System.out.println("Количество элементов коллекции LIST = " + personsList.size());
        for (Person person : personsList) {
            System.out.println(person);
        }

        Person person6 = new Person("Julia", "Roberts", Gender.FEMALE);
        Person person7 = new Person("George", "Clooney", Gender.MALE);

       Set<Person> personsSet = new HashSet<>();
        personsSet.add(person1);
        personsSet.add(person2);
        personsSet.add(person3);
        personsSet.add(person6);
        personsSet.add(person7);

        System.out.println("Количество элементов коллекции Set = " + personsSet.size());
        for (Person person : personsSet) {
            System.out.println(person);
        }

        Map<Integer, Person> personsMap= new HashMap<>();
        personsMap.put(1961,person3);
        personsMap.put(1963,person1);
        personsMap.put(1967,person2);
        personsMap.put(1969,person5);
        personsMap.put(1970,person4);

        System.out.println("Количество элементов коллекции Map = " + personsMap.size());
        for (Map.Entry<Integer, Person> entry : personsMap.entrySet()) {
            System.out.println("Ключ: " + entry.getKey() +" "+ entry.getValue());
        }

    }
}

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

        System.out.println("Количество элементов = " + personsList.size());
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

        System.out.println("Количество элементов = " + personsSet.size());
        for (Person person : personsSet) {
            System.out.println(person);
        }

        Map<Integer, Person> personsMap= new HashMap<>();
        personsMap.put(1961,person3);
        personsMap.put(1963,person1);
        personsMap.put(1967,person2);
        personsMap.put(1969,person5);
        personsMap.put(1970,person4);

        System.out.println("Количество элементов = " + personsMap.size());
        for (Map.Entry<Integer, Person> entry : personsMap.entrySet()) {
            System.out.println("Ключ: " + entry.getKey() +"Ключ: "+ entry.getValue());
        }

    }
}


//    Person get(Object key);

//    HashMap<String, Integer> fruits = new HashMap();
//fruits.put("Количество апельсинов", 5);
//        fruits.put("Количество яблок", 10);
//        fruits.put("Количество мандаринов", 7);
//        System.out.println(fruits.get("Количество мандаринов"));



//    Создайте новый проект, залинкуйте его с удаленным репозиторием на GitHub, добавьте файл .gitignore и сделайте
//    коммит
//        Создайте перечисление Gender со значениями MALE и FEMALE
//        Создайте класс Person с тремя полями: firstName (String, private), lastName (String, private) и
//        gender(тип Gender, private)
//        Переопределите методы equals, hashCode и toString для класса Person
//        Сделайте класс Person неизменяемым (см. подсказку внизу документа)
//        Демонстрация работы с коллекциями типа List. Создайте 5 разных объектов типа Person. Создайте коллекцию
//        типа List (ArrayList или LinkedList неважно), добавьте в нее все созданные объекты. Выведите все элементы
//        коллекции в консоль с указанием общего количества элементов в коллекции
//        Демонстрация работы с коллекциями типа Set. Создайте 5 объектов (2 пары из них должны быть идентичными)
//        типа Person. Создайте коллекцию типа Set, добавьте в нее все созданные объекты. Выведите все элементы
//        коллекции в консоль с указанием общего количества элементов в коллекции (всего элементов в коллекции
//        должно оказаться 3)
//        Демонстрация работы с коллекциями типа Map. Создайте 5 разных объектов типа Person. Создайте коллекцию
//        типа Map (в качестве ключа возьмите целые числа, значение должно быть типа Person), добавьте в нее все
//        созданные объекты (числа-ключи произвольные). Выведите все элементы ассоциативного массива в консоль
//        с указанием общего количества элементов (выводить и ключ, и значение)
//        Залить код в репозиторий и отправить ссылку на репозиторий преподавателю

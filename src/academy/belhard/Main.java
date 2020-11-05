package academy.belhard;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Brad", "Pitt", Gender.MALE);
        Person person2 = new Person("Julia", "Roberts", Gender.FEMALE);
        Person person3 = new Person("George", "Clooney", Gender.MALE);
        Person person4 = new Person("George", "Clooney", Gender.MALE);
        Person person5 = new Person("Julia", "Roberts", Gender.FEMALE);

        List<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);

        System.out.println("Количество элементов = " + persons.size());
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}








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

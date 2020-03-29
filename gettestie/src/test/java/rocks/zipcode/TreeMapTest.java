package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapTest {

    @Test
    public void PersonTree() {
        Comparator<Person> byAge = Comparator.comparing(Person::getYearOfBirth);
        Comparator<Person> byName = Comparator.comparing(Person::getName);
        TreeMap<Person, Address> map = new TreeMap<>(byAge.thenComparing(byName));

        Person person1 = new Person("Han", 1993);
        Person person2 = new Person("Lin", 1999);
        Person person3 = new Person("Sang", 2001);
        Person person4 = new Person("Teresa", 1993);
        Person person5 = new Person("Min", 1993);

        Address address1 = new Address("123 Apple St", "SpringField", "12345");
        Address address2 = new Address("456 Pear St", "Boston", "6789");
        Address address3 = new Address("789 Orange St", "Philly", "54321");

        map.put(person1, address1);
        map.put(person2, address1);
        map.put(person3, address1);
        map.put(person4, address2);
        map.put(person5, address3);

        Person actualFirst = map.firstKey();
        Person actualLast = map.lastKey();

        Assert.assertEquals(person1, actualFirst);
        Assert.assertEquals(person3, actualLast);
    }
}

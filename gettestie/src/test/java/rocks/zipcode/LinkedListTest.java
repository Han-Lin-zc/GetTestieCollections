package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class LinkedListTest {

    @Test
    public void addToMiddle() {
        LinkedList<Person> list = new LinkedList<>();
        Person person1 = new Person("Han", 1993);
        Person person2 = new Person("Lin", 1999);
        Person person3 = new Person("Sang", 2001);

        list.add(person1);
        list.add(person2);
        list.add(1, person3);

        Person expectedFirst = list.get(0);
        Person expectedSecond = list.get(1);
        Person expectedThird = list.get(2);

        Assert.assertEquals(person1, expectedFirst);
        Assert.assertEquals(person3, expectedSecond);
        Assert.assertEquals(person2, expectedThird);
    }
}

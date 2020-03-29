package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class ArrayListTest {

    ArrayList<Person> list;
    Person person1 = new Person("Han", 1993);
    Person person2 = new Person("Lin", 1999);
    Person person3 = new Person("Sang", 2001);

    @Before
    public void setUp() {
        list = new ArrayList<>();
    }

    @Test
    public void addTest() {
        list.add(person1);
        list.add(person2);
        list.add(person3);
        int expectedCount = 3;
        Assert.assertEquals(expectedCount, list.size());
    }

    @Test
    public void removeAllTest() {
        list.add(person1);
        list.add(person2);
        list.add(person3);
        int expectedCount = 0;
        list.clear();
        Assert.assertEquals(expectedCount, list.size());
    }
}

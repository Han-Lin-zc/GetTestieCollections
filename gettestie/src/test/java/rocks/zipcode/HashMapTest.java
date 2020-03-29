package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;
import java.util.HashMap;


public class HashMapTest {


    @Test
    public void containsKeysTest(){
        HashMap<Address, Person> map = new HashMap<>();
        Address address = new Address("123 Apple", "SpringField", "12345");
        Person person = new Person("Han", 1993);

        map.put(address, person);

        Assert.assertTrue(map.containsKey(address));
        Assert.assertTrue(map.containsValue(person));
    }

    @Test
    public void getOrDefault() {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('A', 1);
        map.put('B', 5);

        Integer expected = -1;
        Integer actual = map.getOrDefault('C', -1);

        Assert.assertEquals(expected, actual);
    }
}

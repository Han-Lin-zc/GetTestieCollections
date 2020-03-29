package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;

public class HashSetTest {

    HashSet<String> set;

    @Before
    public void setUp() {
        set = new HashSet<>();
    }

    @Test
    public void daysOfTheWeek() {
        set.add("Monday");
        set.add("Tuesday");
        set.add("Wednesday");
        set.add("Thursday");
        set.add("Friday");
        set.add("Saturday");
        set.add("Sunday");

        Integer expected = 7;
        Integer actual = set.size();
        Assert.assertEquals(expected, actual);

        set.clear();
        Integer expectedAfterClear = 0;
        Integer actualAfterClear = set.size();

        Assert.assertEquals(expectedAfterClear, actualAfterClear);
    }

    @Test
    public void doNotRepeat() {
        set.add("Do");
        set.add("Do");
        set.add("Not");
        set.add("Not");
        set.add("Repeat");
        set.add("Repeat");
        set.add("Do");
        set.add("Not");

        Integer expected = 3;
        Integer actual = set.size();
        Assert.assertEquals(expected, actual);
    }
}

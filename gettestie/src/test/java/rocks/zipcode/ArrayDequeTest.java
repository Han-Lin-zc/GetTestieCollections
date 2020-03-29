package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;

public class ArrayDequeTest {

    @Test
    public void history() {
        ArrayDeque history = new ArrayDeque();

        history.add("CNN");
        history.add("ABC");
        history.add("BBC");
        history.add("PBSKIDS");

        history.removeFirst();

        Assert.assertEquals("ABC", history.peekFirst());
    }
}

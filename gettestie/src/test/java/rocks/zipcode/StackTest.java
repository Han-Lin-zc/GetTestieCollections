package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

public class StackTest {

    @Test
    public void stackTest() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello, World");
        Assert.assertFalse(stack.isEmpty());
    }

    @Test
    public void pushAndPopTest() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello");
        stack.push("World");

        String expected = "World";
        String actual = stack.pop();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void pushPushPopPeek() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello");
        stack.push("World");

        String expectedFirst = "World";
        String expectedSecond = "Hello";

        String actualFirst = stack.pop();
        String actualSecond = stack.peek();
        Boolean actual = stack.isEmpty();

        Assert.assertEquals(expectedFirst, actualFirst);
        Assert.assertEquals(expectedSecond, actualSecond);
        Assert.assertEquals(false, actual);
    }
}

package stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    @Test

    public void testToCheckThat_StackeIsEmpty(){
        Stack myStack = new Stack();
        assertTrue(myStack.isEmpty());

    }
    @Test

    public void testThat_ICanPushInto_MyStack(){
        Stack myStack = new Stack();
        myStack.push("Perez");
        assertFalse(myStack.isEmpty());
    }
    @Test
    public void test_That_ICanPopAnElement_IntoAStack(){
        Stack myStack = new Stack();
        myStack.push( "item");
        myStack.pop("item");
        assertTrue(myStack.isEmpty());
    }
    @Test
    public void test_ThatICan_PeekAnElement_OnTopOfAStack_WithOutRemovingIt(){
        Stack myStack = new Stack();
        String item = "";
        myStack.peek(item);

    }
    @Test
    public void test_ThatICan_SearchAnElement_InAStack(){
        Stack myStack = new Stack();
        myStack.push("item");
        myStack.push("element");
        myStack.push("dog");
        assertEquals(2, myStack.search("element"));
    }
}

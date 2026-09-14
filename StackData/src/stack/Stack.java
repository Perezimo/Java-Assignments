package stack;

public class Stack {

    private String[] items = new String[10];
    private int count;

    public boolean isEmpty() {
        return count == 0;
    }

    public void push(String item) {
        items[count++] = item;
    }

    public void pop(String item) {
        items[--count] = null;

    }

    public int peek(String item) {
        return count - 1;

    }

    public int search(String top) {Stack myStack = new Stack();
        for (int counter = 0; counter < items.length; counter++) {
            if (top == items[counter])
                return count - counter;
        }

        return -1;
    }
}

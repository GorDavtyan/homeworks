package codesection1.GenericStack;

import java.util.ArrayList;
import java.util.List;

public class GenericStack<T> {
    private List<T> stack;

    public GenericStack() {
        stack = new ArrayList<>();
    }

    public void push(T element) {
        stack.add(element);
    }

    public void checkStackIsEmpty() {
        if (stack.size() == 0) {
            throw new IllegalStateException("Stack is empty");
        }
    }

    public T pop() {
        checkStackIsEmpty();
        T item = stack.get(stack.size() - 1);
        stack.remove(item);
        return item;
    }


    public T peek() {
        checkStackIsEmpty();
        return stack.get(stack.size() - 1);
    }

    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }

    public List<T> getStack() {
        return stack;
    }

    public void print() {
        for (T elemenrt : stack) {
            System.out.println(elemenrt);
        }
    }
}

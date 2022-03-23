package stack.base;

import java.util.Stack;

@SuppressWarnings("unchecked")

public class StackDemo <T> {

private Stack <T> list;

    public StackDemo(){

        this.list = new Stack<T>();

    }

    public T peek() {
        
        return list.peek();
    }

    public Boolean empty() {
        
        return list.empty();
    }

    public T pop() {
        return list.pop();
    }


    public void push(T item) {
        list.push(item);
    }

    public int size() {
        return list.size();
    }


    public String toString(){

        return "Stack: " + list;
    }

}

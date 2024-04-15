package org.example;

import java.util.ArrayList;
import java.util.EmptyStackException;


public class MyStack<E> extends ArrayList<E> {
    private ArrayList delegate;
    public MyStack(){
        this.delegate = this;
    }
    public void push(E e) {
        delegate.add(e);
    }

    public E pop() {
        if (isEmpty()) throw new EmptyStackException();
        E e = (E) delegate.get((delegate.size()) - 1);
        delegate.remove((delegate.size()) -1 );
        return e;
    }

}

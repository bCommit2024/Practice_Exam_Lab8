package org.example;

import java.util.ArrayList;
import java.util.EmptyStackException;


public class MyStack<E>{
    private ArrayList delegate;
    public MyStack(){
        this.delegate = new ArrayList<E>();
    }
    public void push(E e) {
        add(e);
    }

    public E pop() {
        if (isEmpty()) throw new EmptyStackException();
        E e = (E) delegate.get((delegate.size()) - 1);
        delegate.remove((delegate.size()) -1 );
        return e;
    }

    public void add(E e){
        delegate.add(e);
    }

    public void clear(){
        delegate.clear();
    }

    public boolean contains(E e){
        return delegate.contains(e);
    }

    public boolean isEmpty(){
        return delegate.isEmpty();
    }

    public int size(){
        return delegate.size();
    }

}

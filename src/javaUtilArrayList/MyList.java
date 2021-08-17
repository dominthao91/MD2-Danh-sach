package javaUtilArrayList;

import java.util.Arrays;

public class MyList<T>{
    private int size = 0;
    private int DEFAULF_CAPACITY = 10;
    private Object elements[];
    public MyList(){
        elements = new Object[DEFAULF_CAPACITY];
    }
    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
    public void add(T t) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = t;
    }
    public T get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (T) elements[i];
    }
}

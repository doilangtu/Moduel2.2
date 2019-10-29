package ArrayList;

import java.util.ArrayList;

import java.util.Arrays;

public class MyList<E> {

    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];
    private static final Object[] EMPTY_ELEMENTDATA = {};
    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }


    public MyList(int capacity) {
        if (capacity > 0) {
            this.elements = new Object[capacity];
        } else if (capacity == 0) {
            this.elements = EMPTY_ELEMENTDATA;
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " +
                    capacity);
        }
    }

    public void ensureCapacity(int minCapcity) {

        elements = Arrays.copyOf(elements, elements.length + minCapcity);

    }

//insert ad
    public void add(int index, E e) {
       checkIndex(index);
       ensureCapacity(size+1);
       System.arraycopy(elements,index,elements,index+1,size-index);
       elements[index]=e;
       size++;
    }

    public E remove(int index) {
        checkIndex(index);
        E e = (E) elements[index];
        System.arraycopy(elements,index+1,elements,index,elements.length-size-1);
        elements[size-1]=null;
        size--;
        return e;
    }

    private void checkIndex(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("index " + index + " out of bonus");
        }
    }


    public int size() {
        return size;
    }

    public MyList<E> clone() {
        MyList <E> newMylist = new MyList<E>();
        newMylist.elements = elements;
        newMylist.size = size;
        return newMylist;

    }
    public boolean contains(E o) {
       return  indexOf(o)>=0;

    }

    public int indexOf(E o) {
        for (int i = 0; i < elements.length; i++)
            if (elements[i]==o||elements[i].equals(o) )
                return i;
        return -1;
    }

    public boolean add(E e) {

        if (e == null) {
            return false;
        } else {
            for (int i = 0; i < size; i++) {
                if (elements[i].equals(e)) {
                    return false;
                }
            }
        }
        elements[size]=e;
        size++;
        return true;

    }


    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }
    public void clear(){
        for (int i = 0; i <size ; i++) {
            elements[i] = null;
        }
           size =0;
        }


    public void showArr() {
        for (int i = 0; i < size; i++) {
            System.out.println(" i = " + i + " value= " + elements[i]);
        }
    }

}
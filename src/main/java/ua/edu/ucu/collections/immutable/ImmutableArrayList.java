package ua.edu.ucu.collections.immutable;

import java.util.Arrays;

public class ImmutableArrayList implements ImmutableList {
    private Object[] array;

    public ImmutableArrayList() {
        this.array = new Object[0];
    }

    public ImmutableArrayList(Object[] from) {
        this.array = from;
    }

    @Override
    public ImmutableArrayList add(Object e) {
        return add(array.length, e);
    }

    @Override
    public ImmutableArrayList add(int index, Object e) {
        if (index > array.length || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        Object[] newArray = new Object[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, index);
        newArray[index] = e;
        System.arraycopy(array, index, newArray, 
                         index + 1, array.length - index);
        return new ImmutableArrayList(newArray);
    }

    @Override
    public ImmutableArrayList addAll(Object[] c) {
        return addAll(array.length, c);
    }

    @Override
    public ImmutableArrayList addAll(int index, Object[] c) {
        if (index > array.length || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        Object[] newArray = new Object[array.length + c.length];
        System.arraycopy(array, 0, newArray, 0, index);
        System.arraycopy(c, 0, newArray, index, c.length);
        System.arraycopy(array, index, newArray, 
                         index + c.length, array.length - index);
        return new ImmutableArrayList(newArray);
    }

    @Override
    public Object get(int index) {
        if (index >= array.length || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }

    @Override
    public ImmutableArrayList remove(int index) {
        if (index >= array.length || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        Object[] newArray = new Object[array.length - 1];
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (i != index) {
                newArray[counter] = array[i];
                counter++;
            }
        }
        return new ImmutableArrayList(newArray);
    }

    @Override
    public ImmutableArrayList set(int index, Object e) {
        if (index >= array.length || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        Object[] newArray = array.clone();
        newArray[index] = e;
        return new ImmutableArrayList(newArray);
    }

    @Override
    public int indexOf(Object e) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == e) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int size() {
        return array.length;
    }

    @Override
    public ImmutableArrayList clear() {
        return new ImmutableArrayList();
    }

    @Override
    public boolean isEmpty() {
        return array.length == 0;
    }

    @Override
    public Object[] toArray() {
        return array;
    }

    @Override
    public String toString() {
        return Arrays.toString(toArray());
    }
}

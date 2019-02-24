package SimpleList;

import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList<E> implements MyList<E> {

    private E[] values;

    public MyArrayList() {
        values = (E[]) new Object[0];
    }

    @Override
    public String toString() {
        return "Dish{" +
                "cooking = " + Arrays.toString(values) +
                '}';
    }

    @Override
    public boolean add(E e) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, values, 0, temp.length);
            values[values.length - 1] = e;
            return true;
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public void remove(int index) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length - 1];
            System.arraycopy(temp, 0, values, 0, index);
            int amountElemAfterIndex = temp.length - index - 1;
            System.arraycopy(
                    temp, index + 1, //src
                    values, index,          //target
                    amountElemAfterIndex);  //amount
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
    }

        @Override
        public E get ( int index){
            return values[index];
        }

        @Override
        public int size () {
            return values.length;
        }

        @Override
        public void set ( int index, E e){
            values[index] = e;
        }

        @Override
        public Iterator<E> iterator () {
            return new ArrayIterator<>(values);
        }
    }

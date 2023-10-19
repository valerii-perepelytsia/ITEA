public class MyList<T> {
    private Object[] elements;
    private int size;

    public MyList() {
        elements = new Object[10];
        size = 0;
    }

    public void add(T item) {
        if (size == elements.length) {
            int newCapacity = elements.length * 2;
            Object[] newElements = new Object[newCapacity];
            for (int i = 0; i < size; i++) {
                newElements[i] = elements[i];
            }
            elements = newElements;
        }

        elements[size] = item;
        size++;
    }

    public T get(int index) {
        if (index >= 0 && index < size) {
            return (T) elements[index];
        } else {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
    }

    public int size() {
        return size;
    }
}
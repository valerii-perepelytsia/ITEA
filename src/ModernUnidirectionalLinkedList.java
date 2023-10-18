import java.util.ArrayList;

public class ModernUnidirectionalLinkedList<T> {
    private ArrayList<T> elements;

    public ModernUnidirectionalLinkedList() {
        this.elements = new ArrayList<>();
    }

    public int size() {
        return elements.size();
    }

    public void add(final T data) {
        elements.add(data);
    }

    public void add(final int index, final T data) {
        if (index >= 0 && index <= elements.size()) {
            elements.add(index, data);
        } else {
            throw new IndexOutOfBoundsException("Invalid index");
        }
    }

    public void remove(int index) {
        if (index >= 0 && index < elements.size()) {
            elements.remove(index);
        } else {
            throw new IndexOutOfBoundsException("Invalid index");
        }
    }

    public void remove(T data) {
        elements.remove(data);
    }

    public void insertHead(T data) {
        elements.add(0, data);
    }

    public T get(int index) {
        if (index >= 0 && index < elements.size()) {
            return elements.get(index);
        } else {
            throw new IndexOutOfBoundsException("Invalid index");
        }
    }
}
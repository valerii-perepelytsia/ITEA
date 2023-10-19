public class ModernUnidirectionalLinkedList<T> {
    private Node<T> head;
    private int size;

    public ModernUnidirectionalLinkedList() {
        head = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public void add(final T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public void add(final int index, final T data) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        if (index == 0) {
            Node<T> newNode = new Node<>(data);
            newNode.next = head;
            head = newNode;
        } else {
            Node<T> newNode = new Node<>(data);
            Node<T> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        size++;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        if (index == 0) {
            head = head.next;
        } else {
            Node<T> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
    }

//    public void remove(T data) {
//        Node<T> current = head;
//        if (current != null && current.data.equals(data)) {
//            head = current.next;
//            size--;
//            return;
//        }
//
//        while (current != null && !current.data.equals(data)) {
//            current = current.next;
//        }
//
//        if (current == null) {
//            return;
//        }
//
//        Node<T> previous = head;
//        while (previous.next != current) {
//            previous = previous.next;
//        }
//        previous.next = current.next;
//        size--;
//    }

    public void insertHead(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    private class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.data;
    }
}
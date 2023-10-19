public class MyDictionary<K, V> {
    private Node<K, V> head;
    private int size;

    private static class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public MyDictionary() {
        head = null;
        size = 0;
    }

    public void addElement(K key, V value) {
        Node<K, V> newNode = new Node<>(key, value);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public V getElement(K key) {
        Node<K, V> current = head;
        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }

    public int size() {
        return size;
    }
}
import java.util.ArrayList;

public class MyDictionary<K, V> {
    private ArrayList<K> keys;
    private ArrayList<V> values;

    public MyDictionary() {
        keys = new ArrayList<>();
        values = new ArrayList<>();
    }

    public void addElement(K key, V value) {
        keys.add(key);
        values.add(value);
    }

    public V getElement(K key) {
        int index = keys.indexOf(key);
        if (index != -1) {
            return values.get(index);
        }
        return null;
    }

    public final int size() {
        return keys.size();
    }
}
package etc.generic;

public class MultiBox<K, V> {
    private K key1;
    private V value1;

    public MultiBox(K key1, V value1) {
        this.key1 = key1;
        this.value1 = value1;
    }

    public void put(K key1, V value1) {
        this.key1 = key1;
        this.value1 = value1;
    }

    public V get() {
        return this.value1;
    }

    @Override
    public String toString() {
        return "MultiBox{" +
                "key1: " + key1 +
                ", value1: " + value1 +
                '}';
    }
}

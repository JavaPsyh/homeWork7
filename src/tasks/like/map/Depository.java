package tasks.like.map;

public class Depository<T, V> {
    private T key;
    private V value;

    public Depository(T key, V value) {
        this.key = key;
        this.value = value;
    }

    public T getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

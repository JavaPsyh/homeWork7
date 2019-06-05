package tasks.like.map;

public class Storage<T, V> {

    private final int DEFAULT_CAPACITY = 5;
    private Depository<T, V>[] values = new Depository[DEFAULT_CAPACITY];
    private int indexForNextPut = 0;

    public Storage() {
    }

    public int getIndexForNextPut() {
        return indexForNextPut;
    }

    public void arrayGrower() {
        Depository[] temp;
        temp = new Depository[values.length + (values.length >> 1)];
        System.arraycopy(values, 0, temp, 0, values.length);
        values = temp;
    }

    public void put(T key, V value) {

        if (indexForNextPut == values.length) {
            arrayGrower();
        }
        values[indexForNextPut] = new Depository(key, value);
        indexForNextPut++;
    }

    public V get(T key) {
        V result = null;
        for (int i = 0; i < indexForNextPut; i++) {
            if (key == values[i].getKey()) {
                result = values[i].getValue();
            }
        }
        return result;
    }
}

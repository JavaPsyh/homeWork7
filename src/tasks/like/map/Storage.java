package tasks.like.map;

public class Storage<T, V> {

    private Something<T, V>[] values = new Storage.Something[5];
    private int indexForNextPut = 0;

    public Storage() {
    }

    public int getIndexForNextPut() {
        return indexForNextPut;
    }

    public void put(T key, V value) {

        if (indexForNextPut == values.length) {
            Something[] temp;
            temp = new Something[values.length + (values.length / 2)];
            for (int i = 0; i < values.length; i++) {
                temp[i] = values[i];
            }
            values = temp;
        }
        values[indexForNextPut] = new Something( key, value);
        indexForNextPut++;
    }

    public V get(T key) {
        V result = null;
        for (int i = 0; i < indexForNextPut; i++) {
            if (key == values[i].getKey()) {
                result = values[i].getSomething();
            }
        }
        return result;
    }

    public class Something<T, V> {
        private T key;
        private V something;

        public Something(T i, V something) {
            this.key = i;
            this.something = something;
        }

        private T getKey() {
            return key;
        }

        private V getSomething() {
            return something;
        }
    }
}

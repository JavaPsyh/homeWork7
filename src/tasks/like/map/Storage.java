package tasks.like.map;

/**
 * 1) https://stepik.org/lesson/12775/step/12?unit=3123 ,
 * <p>
 * 2) Создайте хранилище типа КЛЮЧ - ЗНАЧЕНИЕ, которое параметризируется 2-умя типами данных,
 * и в этом хранилище можо класть значение по ключу и доставать значение по ключу.
 * Пример:
 * Storage<Integer, Box> storage = new Storage<>();
 * storage.put(22, box);
 * storage.get(22) // вернёт коробку.
 * <p>
 * 3) Почитать про WildCard и принцип PECS
 */

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

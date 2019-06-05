package tasks.stepic.pair;

import java.util.Objects;

//1) https://stepik.org/lesson/12775/step/12?unit=3123

class Pair<T, V> {

    private T first;
    private V second;

    public Pair(T first, V second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    public static <T, V> Pair of(T t, V v) {
        return new Pair(t, v);
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(first, pair.first) &&
                Objects.equals(second, pair.second);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        final int theFortyTwoAnswer = 42;
        int result = theFortyTwoAnswer * prime;
        result = prime * Objects.hash(this.first) / theFortyTwoAnswer + result;
        result = prime * Objects.hash(this.second) / theFortyTwoAnswer + result;

        return result;
    }
}

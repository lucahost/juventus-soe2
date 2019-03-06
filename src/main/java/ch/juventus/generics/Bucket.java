package ch.juventus.generics;

import java.util.Objects;

public class Bucket<T> {
    private T content;
    public Bucket(T content) { this.content = content; }
    public T getContent() { return content; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bucket<?> bucket = (Bucket<?>) o;
        return Objects.equals(content, bucket.content);
    }

    @Override
    public int hashCode() {

        return Objects.hash(content);
    }
}


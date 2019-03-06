package ch.juventus.generics;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BucketTest {

    @Test
    void createIntBucket() {
        Bucket<Integer> intBucket = new Bucket(Integer.valueOf(3));
        assertEquals(3, intBucket.getContent().intValue());
    }

    @Test
    void createBucketOfBuckets() {
        Bucket<Bucket<String>> bucketInBucket = new Bucket(new Bucket("Hello"));
        assertEquals("Hello", bucketInBucket.getContent().getContent());
    }

    @Test
    void createUnboundWildcardBucket() {
        Bucket<?> bucket = new Bucket<>(2); // autoboxing
        assertEquals(Integer.valueOf(2), bucket.getContent()); //
    }

    @Test
    void createBoundWildcardBucket() {
        Bucket<? extends Number> bucket = new Bucket<>(2); // autoboxing
        assertEquals(Integer.valueOf(2), bucket.getContent()); //
    }

    @Test
    void somethingWithArrays() {
        List<String> list = getList();
        list.add("5");
        String s = list.get(0);
    }

    private List<String> getList() {
        return new ArrayList<>();
    }

}

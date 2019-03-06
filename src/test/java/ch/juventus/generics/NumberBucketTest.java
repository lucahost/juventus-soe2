package ch.juventus.generics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberBucketTest {

    @Test
    void getContent() {
        NumberBucket<Double> bucket = new NumberBucket<Double>(4d);
        assertEquals(4d, bucket.getContent());
    }
}

package ch.juventus.generics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BucketClonerTest {

    @Test
    public void cloneBucket() {

        Bucket<Integer> intBucket = new Bucket<>(Integer.valueOf(2));
        Bucket<Integer> clonedBucket = new BucketCloner().<Integer>cloneBucket(intBucket);
        assertEquals(intBucket, clonedBucket);

    }

}

package ch.juventus.generics;

public class BucketCloner {

    public <R> Bucket<R> cloneBucket(Bucket<R> bucket) {
        return new Bucket<R>(bucket.getContent());
    }
}

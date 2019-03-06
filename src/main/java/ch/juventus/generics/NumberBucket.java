package ch.juventus.generics;

public class NumberBucket <N extends Number> {

    private N content;

    public NumberBucket(N content) {
        this.content = content;
    }

    public N getContent() {
        return content;
    }
}

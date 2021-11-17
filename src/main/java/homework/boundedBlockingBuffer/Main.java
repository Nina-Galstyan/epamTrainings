package homework.boundedBlockingBuffer;

import homework.boundedBlockingBuffer.thread.Consumer;
import homework.boundedBlockingBuffer.thread.Producer;

public class Main {
    public static void main(String[] args) {
        BoundedBlockingBuffer<Integer> boundedBlockingBuffer = new BoundedBlockingBuffer();
        new Producer(boundedBlockingBuffer);
        new Consumer(boundedBlockingBuffer);
        boundedBlockingBuffer.put(12);
        boundedBlockingBuffer.take();

    }
}

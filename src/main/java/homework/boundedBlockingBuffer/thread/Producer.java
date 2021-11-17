package homework.boundedBlockingBuffer.thread;

import homework.boundedBlockingBuffer.BoundedBlockingBuffer;

public class Producer implements Runnable {
    BoundedBlockingBuffer boundedBlockingBuffer;

    public Producer(BoundedBlockingBuffer boundedBlockingBuffer) {
        this.boundedBlockingBuffer = boundedBlockingBuffer;
        new Thread(this, "Consumer").start();
    }

    @Override
    public void run() {
        if (boundedBlockingBuffer.getData() != null) {
            while (true) {
                boundedBlockingBuffer.put(boundedBlockingBuffer.getData());
            }
        }

    }
}

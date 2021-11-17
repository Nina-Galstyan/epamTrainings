package homework.boundedBlockingBuffer.thread;

import homework.boundedBlockingBuffer.BoundedBlockingBuffer;

public class Consumer implements Runnable {
    BoundedBlockingBuffer boundedBlockingBuffer;

    public Consumer(BoundedBlockingBuffer boundedBlockingBuffer) {
        this.boundedBlockingBuffer = boundedBlockingBuffer;
        new Thread(this, "Producer").start();
    }

    @Override
    public void run() {
        while (true) {
            boundedBlockingBuffer.take();
        }
    }
}

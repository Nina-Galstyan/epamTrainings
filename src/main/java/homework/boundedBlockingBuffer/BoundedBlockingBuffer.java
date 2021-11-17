package homework.boundedBlockingBuffer;

public class BoundedBlockingBuffer<T> {
    private T data;
    boolean dataSet = false;

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public synchronized T take() {
        while (!dataSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Exception type: InterruptedException ");
            }
        }
        System.out.println("take: " + data);
        dataSet = false;
        notify();
        return data;
    }

    public synchronized void put(T data) {
        while (dataSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Exception type: InterruptedException ");
            }
        }
        this.data = data;
        dataSet = true;
        System.out.println("put:" + data);
        notify();
    }
}


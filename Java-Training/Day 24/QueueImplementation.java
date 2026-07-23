public class QueueImplementation {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    public QueueImplementation(int size) {
        this.maxSize = size;
        this.queueArray = new int[maxSize];
        this.front = 0;
        this.rear = -1;
        this.nItems = 0;
    }

    public void insert(int value) {
        if (rear == maxSize - 1) {
            rear = -1;
        }
        queueArray[++rear] = value;
        nItems++;
    }

    public int remove() {
        int temp = queueArray[front++];
        if (front == maxSize) {
            front = 0;
        }
        nItems--;
        return temp;
    }

    public int peek() {
        return queueArray[front];
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public static void main(String[] args) {
        QueueImplementation queue = new QueueImplementation(5);
        queue.insert(10);
        queue.insert(20);
        queue.insert(30);

        System.out.println("Front element: " + queue.peek());
        System.out.println("Removed element: " + queue.remove());
        System.out.println("Front element after remove: " + queue.peek());
    }
}

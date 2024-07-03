public class Main {
    public static void main(String[] args) {
        IndexBuffer ib = new IndexBuffer();
        Producer producer = new Producer(ib);
        Consumer consumer = new Consumer(ib);

        producer.start();
        consumer.start();notify();
    }
}

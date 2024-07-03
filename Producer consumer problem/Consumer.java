public class Consumer extends Thread {
    IndexBuffer ib;

    Consumer(IndexBuffer ib) {
        this.ib = ib;
    }

    public void run() {
        while (true) {
            try {
                int item = ib.consumeItem();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}

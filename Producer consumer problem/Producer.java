public class Producer extends Thread {
    IndexBuffer ib;

    Producer(IndexBuffer ib){
        this.ib=ib;
    }

    public void run(){
        int a = 1;
        while (true) { 
            try {
                ib.produceItem(a);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            a++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
               
            }
        }
    }
}


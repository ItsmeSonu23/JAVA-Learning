public class IndexBuffer{
    int buffer;
    boolean flag = false;

    synchronized public void produceItem(int item) throws InterruptedException{
        if(flag==true){
            wait();
        }
        buffer = item;
        System.out.println("Produce item : "+buffer);
        flag = true;
        notify();
    }

    synchronized public int consumeItem() throws InterruptedException{
        if(flag == false){
            wait();
        }
        System.out.println("consumer item :"+buffer);
        flag = false;
        notify();
        return buffer;
    }
}
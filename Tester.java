public class Tester{
   
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread t3 = new Thread(t1);
        t3.start();

        Thread2 temp = new Thread2();
        Thread t2 = new Thread(temp);
        t2.start();

        for(int i =0; i<=5;i++){
            System.out.println(Thread.currentThread().getName()+ i);
        };
    };


   
}
class Brackets{
    public void printBrackets(char open, char close){
        for(int i =0; i<=10;i++){
            if(i<5){
                System.out.print(open);
            }else{
                System.out.print(close);
            }
            
        }
        System.out.println();
    }
}



public class Sync {
    public static void main(String[] args) {
        Brackets br = new Brackets();

        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
               for(int i =0;i<5;i++){
                    br.printBrackets('[', ']');
               }
            };
         
        });

        t1.start();
    }
}

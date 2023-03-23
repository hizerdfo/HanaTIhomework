package javaClass0322;

class CountUpThread1 extends Thread{
    public void run(){
        for(int i = 0; i < 50; i++){
            System.out.println(i);
        }
    }
}

class CountUpThread2 implements Runnable {
    public void run(){
        for(int i = 0; i < 50; i++){
            System.out.printf("%d \t", i);
        }
    }
        }
class CountUpThread {
    public static void main(String args[]){
        CountUpThread1 t1= new CountUpThread1();
        CountUpThread1 t2 = new CountUpThread1();
        CountUpThread1 t3 = new CountUpThread1();
//        Runnable r = new CountUpThread2();
//        Thread t2 = new Thread(r);

        t1.start();

        t2.start();
        t3.start();

//        t2.start();
    }
}
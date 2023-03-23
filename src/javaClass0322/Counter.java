package javaClass0322;

public class Counter {
    private long count = 0;

    public void add(long i) {
        System.out.println("더하기");
        synchronized (this){
            count += i;
        }

    }

    public void mul(long i){
        System.out.println("곱하기");
        synchronized (this){
            count -= i;
        }
    }
}

class CounterTreadAdd implements Runnable {
    public void run(){

    }
}

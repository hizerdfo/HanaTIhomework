package Exam4;


enum KeyType {
    PADLOCK(1024), BUTTON(10000), DIAL(30000), FINGER(1000000);

    private int useLimit;

    KeyType(int useLimit){
        this.useLimit = useLimit;
    }

    public int getLimit(){
        return useLimit;
    }
}

public class StrongBox<E>{
    private E data;
    private KeyType keyType;
    private int cnt;

    public StrongBox(KeyType keyType){
        this.keyType = keyType;
        this.cnt = 0;
    }

    public void put(E data){
        this.data = data;
    }

    public E get(){
        cnt++;
        if(cnt < keyType.getLimit()){
            return null;
        } else {
            return this.data;
        }
    }

}
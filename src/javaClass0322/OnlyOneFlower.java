package javaClass0322;

public class OnlyOneFlower {
    private static OnlyOneFlower instance = new OnlyOneFlower();
    private OnlyOneFlower() {}

    public static OnlyOneFlower getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        OnlyOneFlower flower1 = OnlyOneFlower.getInstance();
        OnlyOneFlower flower2 = OnlyOneFlower.getInstance();

        System.out.println(flower2 == flower1);
    }
}


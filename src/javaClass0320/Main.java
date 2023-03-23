package javaClass0320;
import java.io.IOException;


public class Main {

    public static void main(String[] args) {

        try{
            System.out.println("프로그램 시작");
            throw new IOException("예외 발생");
        } catch (IOException e){
            e.printStackTrace();
            System.exit(1);
        }

    }

}

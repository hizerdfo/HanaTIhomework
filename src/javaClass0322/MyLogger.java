package javaClass0322;

import java.io.FileWriter;
import java.io.IOException;

public class MyLogger {
    /*
    디자인 패턴을 활용하여 다음 조건에 맞는 MyLogger 클래스를 만드시오.
File을 닫는 처리는 생략해도 됨.
인스턴스화와 동시에 dummylog.txt 파일을 연다
인수로 전달하는 문자열을 파일에 쓰는 log() 메소드를 가진다
다음과 같이 사용해도 에러를 내지 않고 2개의 로그 메시지가 동일 파일에 순서대로 출력되어야 한다.
     */
    private static MyLogger instance = new MyLogger();
    private FileWriter write;

    private MyLogger() {
        try {
            write = new FileWriter("dummylog.txt",true);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public MyLogger log(String t) {
        try{
            write.write(t);
            write.flush();
        } catch (IOException e){
            e.printStackTrace();
        }
        return instance;
    }

    public static MyLogger getInstance() { return instance; }

    public static void main(String[] args){
        MyLogger logger1 = MyLogger.getInstance();
        MyLogger logger2 = MyLogger.getInstance();

        logger1.log("first");
        logger2.log("second");
    }

}

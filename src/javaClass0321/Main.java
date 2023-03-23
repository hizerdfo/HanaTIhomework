package javaClass0321;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.awt.image.BufferedImage;


interface MyFunction {
    boolean call(int n);
}
interface Function<T,R> {
    boolean result(boolean male, String name);
}
public class Main {
    private final static String IMAGEurl = "https://alimipro.com/favicon.ico";
    public static void main(String[] args) {
        /*
        MyFunction isOdd = (int n) -> n % 2 == 1;
        boolean resultIsOdd = isOdd.call(12);
        if(resultIsOdd){
            System.out.println("홀수입니다.");
        } else {
            System.out.println("짝수입니다.");
        }*/



        try {
            URL url = new URL(IMAGEurl);
            String extension = IMAGEurl.substring(IMAGEurl.indexOf('.')+1);
            BufferedImage image = ImageIO.read(url);
            File file = new File("icon.ico");

            ImageIO.write(image,extension,file);
            System.out.println("완료");
        } catch (IOException e) {
            e.printStackTrace();
        }




    }

}

import java.util.Scanner;
public class ucgendeAlan {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int a,h;
        double alan;

        System.out.print("taban alanını yazınız:");
        a = inp.nextInt();

        System.out.print("yüksekliği yazınız:");
        h = inp.nextInt();

        alan = (a*h) / 2.0;
        System.out.print("üçgenin alanı:" + alan);



    }
}

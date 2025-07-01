import java.util.Scanner;
public class vucutKitleIndeksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double VKI,m,kg;

        System.out.print("boyunuzu 'm' cinsinden giriniz:");
        m = input.nextDouble();
        System.out.print("kilonuzu 'kg' cinsinden giriniz:");
        kg = input.nextDouble();
        VKI = kg / (m * m);


        String sonuc = (VKI >= 18.5 && VKI <= 24.9) ? "Sağlıklı" : "Sağlıksız";



        System.out.println("Vücut Kitle İndeksiniz (VKİ):" + VKI);
        System.out.print("Durumunuz:" + sonuc);






    }
}

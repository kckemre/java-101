import java.util.Scanner;
public class notOrtalamasi {
    public static void main(String[] args) {
        // Değişkenleri oluştur
        int matematik,fizik,kimya,turkce,tarih,muzik;

        //scanner sınıfımızı tanımladık
        Scanner inp = new Scanner(System.in);

        //kullanıcıdan değerleri al
        System.out.print("matematik notunuz:");
        matematik = inp.nextInt();

        System.out.print("fizik notunuz:");
        fizik = inp.nextInt();

        System.out.print("kimya notunuz;");
        kimya = inp.nextInt();

        System.out.print("türkçe notunuz:");
        turkce = inp.nextInt();

        System.out.print("tarih notunuz:");
        tarih = inp.nextInt();

        System.out.print("müzik notunuz;");
        muzik = inp.nextInt();

        int toplam = (matematik + fizik + kimya + turkce + tarih + muzik) ;
        double sonuc = toplam / 6.0;
        System.out.println("not ortalmanız: " + sonuc);

        String bitis = sonuc >= 50 ? "tebrikler sınıfı geçtiniz" : "maalesef ki kaldınız";
        System.out.println(bitis);






    }
}
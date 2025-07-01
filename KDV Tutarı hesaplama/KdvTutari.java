import java.util.Scanner;
public class KdvTutari {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double tutar,kdvfiyati,kdvliTutar;

        System.out.print("Ürünün fiyatını yazınız:");
        tutar = inp.nextDouble();

        double kdvOran =(tutar >= 0 && tutar <= 1000 ) ? 0.18 : 0.8 ;


        kdvfiyati = tutar * kdvOran;
        kdvliTutar = tutar + kdvfiyati;


        System.out.println("KDV'siz fiyat" + tutar);
        System.out.println("KDV oranı:" + kdvOran);
        System.out.println("KDV'li fiyat:" + kdvliTutar);
        System.out.print("KDV tutarı:" + kdvfiyati);

    }

}
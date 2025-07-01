import java.util.Scanner;
public class KdvTutari {
    public static void main(String[] args) {
        int araba,ev,ucak,telefon;
        Scanner inp = new Scanner(System.in);
        System.out.print("Araba fiyatını yazınız:");
        araba = inp.nextInt();
        int sonuc = araba + 25;
        System.out.print("KDV'li fiyat:" + sonuc);


    }
}

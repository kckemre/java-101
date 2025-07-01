import java.util.Scanner;
public class taksiMetre {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int km,acilisUcreti = 10;
        double tutar;

        System.out.print("kaç km gideceksiniz?");
        km = input.nextInt();

        tutar = acilisUcreti + (km * 2.20);
        double a =(tutar > 20.0) ? tutar : 20.0;

        System.out.print("toplam tutar:" + a);

    }
}

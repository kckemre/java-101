import java.util.Scanner;
public class manav {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double kg1,kg2,kg3,kg4,kg5,toplam;

        System.out.print("Kaç kg armut aldınız?");
        kg1 = inp.nextDouble();

        System.out.print("Kaç kg elma aldınız?");
        kg2 = inp.nextDouble();

        System.out.print("Kaç kg domates aldınız?");
        kg3 = inp.nextDouble();

        System.out.print("Kaç kg muz aldınız?");
        kg4 = inp.nextDouble();

        System.out.print("Kaç kg patlıcan aldınız?");
        kg5 = inp.nextDouble();

        toplam = kg1*2.14+kg2*3.67+kg3*1.11+kg4*0.95+kg5*5.00;

        System.out.println("armut fiyatı:" + kg1*2.14);
        System.out.println("elma fiyatı:" + kg2*3.67);
        System.out.println("domates fiyatı:" + kg3*1.11);
        System.out.println("muz fiyatı:" + kg4*0.95);
        System.out.println("patlıcan fiyatı:" + kg5*5.00);
        System.out.print("toplam fiyat:" + toplam );



    }
}

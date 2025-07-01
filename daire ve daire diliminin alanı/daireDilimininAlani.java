import java.util.Scanner;
public class daireDilimininAlani {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r,a,sonuc,pi= 3.14;

        System.out.print("Yarı çapı yazınız:");
        r = input.nextDouble();

        System.out.print("Merkez açısı ölçüsünü yazınız:");
        a = input.nextDouble();

        sonuc = (pi*r*r*a)/360;

        System.out.print("Daire diliminin alanı:" + sonuc);



    }
}

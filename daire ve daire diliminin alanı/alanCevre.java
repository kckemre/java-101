import java.util.Scanner;
public class alanCevre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r,alan,cevre,pi = 3.14;
        System.out.print("dairenin yarı çapını yazınız:");
        r = input.nextDouble();

        alan = pi * r * r;
        cevre = 2 * pi * r;

        System.out.println("Dairenin Alanı:" + alan);
        System.out.print("Dairenin Çevresi:" + cevre);



    }
}

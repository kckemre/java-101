import java.util.Scanner;
public class hipotenusBulma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double birinci,ikinci,dik,a,b;

        System.out.print("birinci kenarı yazınız:");
        birinci = inp.nextDouble();

        System.out.print("ikinci kenarı yazınız:");
        ikinci = inp.nextDouble();

        a = birinci * birinci;
        b = ikinci * ikinci;
        dik = Math.sqrt(a + b);

        System.out.print("hipotenüs:" + dik);

    }
}

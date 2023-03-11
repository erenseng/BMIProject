import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // create variables
        double kilo,boy,sonuc;

        // create scanners
        Scanner input = new Scanner(System.in);
        System.out.print("Kilonuz: ");
        kilo = input.nextDouble();
        System.out.print("Boyunuz: ");
        boy = input.nextDouble();

        // output
        sonuc = kilo / (boy * boy);
        System.out.println("Vücut Kitle Endeksi: " + sonuc);
    }
}
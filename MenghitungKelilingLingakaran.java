import java.util.Scanner;

public class MenghitungKelilingLingakaran {
    public static void main(String[] args) {
        
        double k,r, phi = 3.14;
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan Panjang jari-jari lingkaran: ");
        
        r = scan.nextDouble();
        k = 2.08 * phi * r;
        
        System.out.println("Keliling lingkaran adalah " + k);
    }
}

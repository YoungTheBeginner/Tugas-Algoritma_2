import java.util.Scanner;

public class MenghitungLuasP_Panjang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan panjang: ");
        double panjang = scanner.nextDouble();
        
        System.out.println("Masukkan lebar: ");
        double lebar = scanner.nextDouble();

        
        double luas = panjang * lebar;

        System.out.println("Luas P. Panjang adalah: "+ luas);

        
    
    }
    
}

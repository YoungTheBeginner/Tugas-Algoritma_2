import java.util.Scanner;

public class MenghitungVolumeKubus {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan sisi: ");
        double sisi = scanner.nextDouble();

        double volumeKubus = sisi*sisi*sisi;
        
        System.out.println("Volume Kubus : " +volumeKubus);
    }
}

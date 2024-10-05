import java.util.Scanner;

public class MenghitungSuhu {
    public static void main(String[] args) {
        
        Scanner inputan = new Scanner(System.in);
        double reamur, celsius, fahrenheit;
        System.out.print("Masukan suhu Reamur: ");
        
        reamur = inputan.nextDouble();
        celsius = 5.0 / 4.0 * reamur;
        fahrenheit = 9.0 / 5.0 * celsius + 32.0;

        System.out.println("Suhu Celsius = " + celsius);
        System.out.println("Suhu Reamur = " + reamur);
        System.out.println("Suhu Fahrenheit = " + fahrenheit);
        
        inputan.close();
    }
}

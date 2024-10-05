public class MenghitungUangKembalianTelur {

    public static void main(String[] args) {
        
        float hargaTelur, jumlahTelur, total, bayar, kembalian;
        hargaTelur = 28000f;
        jumlahTelur = 2.5f;
        total = hargaTelur * jumlahTelur;
        bayar = 100000f;
        
        kembalian = bayar - total;
        
        System.out.println("Harga Telur Perkilo: Rp." +hargaTelur);
        System.out.println("Jumlah telur: "+jumlahTelur+" Kg");
        System.out.println("Total Harga: Rp."+total);
        System.out.println("Uang yang diberikan: Rp."+bayar);
        System.out.println("Uang kembalian: "+kembalian);

    }
}
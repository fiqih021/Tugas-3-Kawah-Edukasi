import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("==========================================");
        System.out.println("1. hitung luas lingkaran");
        System.out.println("2. hitung volume balok");
        System.out.println("==========================================");
        System.out.print("pilihan anda: ");
        int pilihan = in.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("jari-jari = ");
                double jari = in.nextDouble();
                System.out.println("LUAS = " + (3.14 * jari*jari));
                break;
            case 2:
                System.out.print("panjang = ");
                double panjang = in.nextDouble();
                System.out.print("lebar = ");
                double lebar = in.nextDouble();
                System.out.print("tinggi = ");
                double tinggi = in.nextDouble();

                System.out.println("VOLUME = " + (panjang*lebar*tinggi));

                break;
        
            default:
                System.out.println("pilihan tidak tersedia");
                break;
        }
    }
}

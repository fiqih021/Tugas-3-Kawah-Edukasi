import java.util.Scanner;

/**
 * tugas1
 */
public class tugas1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("masukkan nama: ");
        String nama = in.nextLine();
        System.out.print("masukkan nama: ");
        System.out.println("selamat datang di kawah edukasi " + nama);

        Short short1 = 0;
        short short2 = 1;

        double double1 = 2;
        double double2 = 3;

        char char1 = nama.charAt(0);
        char char2 = nama.charAt(nama.length() - 1);

        boolean benar = true;
        boolean salah = !benar;

        String string1 = "Saya senang ";
        String string2 = " belajar";
        String string3 = " Java Language";

        System.out.println("huruf pertama nama = " + char1);
        System.out.println("huruf terakhir nama = " + char2);
        System.out.println("short1 = " + short1);
        System.out.println("short2 = " + short2);
        System.out.println("double1 = " + double1);
        System.out.println("double2 = " + double2);
        System.out.println("benar = " + benar);
        System.out.println("salah = " + salah);

        System.out.println(string1+string2+string3);

    }
}
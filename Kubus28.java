import java.util.Scanner;

public class Kubus28 {
    public static int hitungVolume(int sisi) {
        return sisi * sisi * sisi;
    }

    public static int hitungLuasPermukaan(int sisi) {
        return 6 * (sisi * sisi);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi kubus: ");
        int sisi = scanner.nextInt();

        int volume = hitungVolume(sisi);
        int luasPermukaan = hitungLuasPermukaan(sisi);

        System.out.println("Sisi kubus: " + sisi);
        System.out.println("Volume kubus: " + volume);
        System.out.println("Luas permukaan kubus: " + luasPermukaan);
    }
}

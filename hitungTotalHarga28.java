import java.util.Scanner;

public class hitungTotalHarga28 {
    public static int hitungTotalHarga(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu-1] * banyakItem;
        return hargaTotal;
    }

    public static double hitungDiskon(int totalHarga, String kodePromo) {
        if (kodePromo.equals("DISKON50")) {
            System.out.println("Kode promo: " + kodePromo + ". Anda mendapatkan diskon 50%!");
            return totalHarga * 0.5;
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Kode promo: " + kodePromo + ". Anda mendapatkan diskon 30%!");
            return totalHarga * 0.7;
        } else {
            System.out.println("Kode promo: " + kodePromo + " tidak berlaku.");
        }
        return totalHarga;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] daftarMenu = {
            "Kopi - Rp15,000",
            "Teh - Rp20,000",
            "Coklat - Rp22,000",
            "Es Lemon - Rp12,000",
            "Air Mineral - Rp10,000",
            "Jus Buah - Rp18,000"
        };

        System.out.println("==== MENU RESTO KAFE ====");
        for (int i = 0; i < daftarMenu.length; i++) {
            System.out.println((i + 1) + ". " + daftarMenu[i]);
        }
        System.out.println("===========================");

        int totalKeseluruhan = 0;
        char tambahPesanan = 'n';

        do {
            System.out.print("Masukkan nomor menu yang ingin Anda pesan: ");
            int pilihanMenu = scanner.nextInt();

            if (pilihanMenu < 1 || pilihanMenu > daftarMenu.length) {
                System.out.println("Pilihan menu tidak valid! Silakan coba lagi.");
                continue;
            }

            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = scanner.nextInt();

            int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem);
            totalKeseluruhan += totalHarga;
            scanner.nextLine();

            System.out.print("Apakah Anda ingin menambahkan pesanan lagi? (y/n): ");
            tambahPesanan = scanner.nextLine().charAt(0);

        } while (tambahPesanan == 'y' || tambahPesanan == 'Y');

        System.out.print("Masukkan kode promo (jika ada): ");
        String kodePromo = scanner.nextLine();

        double hargaAkhir = hitungDiskon(totalKeseluruhan, kodePromo);

        System.out.println("===========================");
        System.out.println("Total harga keseluruhan pesanan Anda: Rp" + hargaAkhir);
        System.out.println("Terima kasih telah memesan di Resto Kafe!");
    }
}
import java.util.Scanner;

public class PenjualanCafe {
    public static String[] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};
    public static int[][] penjualan = {
        {20, 20, 25, 20, 10, 60, 10}, 
        {30, 80, 40, 10, 15, 20, 25}, 
        {5, 9, 20, 25, 10, 5, 45},    
        {50, 8, 17, 18, 10, 30, 6},  
        {15, 10, 16, 15, 10, 10, 55}  
    };

    public static void inputDataPenjualan() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Mengubah Data Penjualan ===");

        System.out.println("Pilih menu yang ingin diubah:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i]);
        }
        System.out.print("Masukkan pilihan (1-5): ");
        int menuIndex = scanner.nextInt() - 1; 

        System.out.println("\nPilih hari yang ingin diubah (1-7):");
        for (int i = 0; i < 7; i++) {
            System.out.println("Hari ke-" + (i + 1));
        }
        System.out.print("Masukkan pilihan hari (1-7): ");
        int hariIndex = scanner.nextInt() - 1; 

        System.out.print("Masukkan jumlah penjualan baru: ");
        int jumlahBaru = scanner.nextInt();

        penjualan[menuIndex][hariIndex] = jumlahBaru;
        System.out.println("\nData penjualan untuk menu " + menu[menuIndex] + " pada Hari ke-" + (hariIndex + 1) + " telah diubah menjadi " + jumlahBaru);
    }

    public static void DataPenjualan() {
        System.out.println("Data Penjualan:");
        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i] + ": ");
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print(penjualan[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void MenuTerlaris() {
        int totalPenjualan;
        int penjualanTertinggi = 0;
        String menuTerlaris = "";
        
        for (int i = 0; i < menu.length; i++) {
            totalPenjualan = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                totalPenjualan += penjualan[i][j];
            }
            if (totalPenjualan > penjualanTertinggi) {
                penjualanTertinggi = totalPenjualan;
                menuTerlaris = menu[i];
            }
        }
        System.out.println("Menu terlaris: " + menuTerlaris + " dengan total penjualan " + penjualanTertinggi);
    }

    public static void RataPenjualan() {
        System.out.println("Rata-rata Penjualan:");
        for (int i = 0; i < menu.length; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                totalPenjualan += penjualan[i][j];
            }
            double rataRata = (double) totalPenjualan / penjualan[i].length;
            System.out.printf("%s: %.2f%n", menu[i], rataRata);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DataPenjualan();
        System.out.print("\nApakah Anda ingin mengubah data penjualan? (Ya/Tidak): ");
        String pilihan = input.nextLine().toLowerCase();
        if (pilihan.equals("ya")) {
            inputDataPenjualan();
        } else {
            System.out.println("\nData penjualan tidak diubah.");
        }
        MenuTerlaris();
        RataPenjualan();
    }
}

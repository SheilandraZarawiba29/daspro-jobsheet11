public class PengunjungCafe28 {
    public static void daftarPengunjung(String[] namaPengunjung, int[] umurPengunjung) {
        System.out.println("Daftar Pengunjung dan Umur:");

        for (int i = 0; i < namaPengunjung.length; i++) {
            System.out.println("- " + namaPengunjung[i] + ", Umur: " + umurPengunjung[i]);
        }
    }

    public static void main(String[] args) {
        String[] nama = {"Ali", "Budi", "Citra"};
        int[] umur = {25, 30, 28};
        daftarPengunjung(nama, umur);
    }
}

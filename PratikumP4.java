import java.util.Scanner;

public class PratikumP4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inisialisasi variabel
        String riwayatKegiatan = ""; // Untuk menampung daftar nama kegiatan
        int total = 0; //

        System.out.println("--- Input Data SSKM (Maksimal 5) ---");

        // Pengulangan input data 5x
        for (int i = 1; i <= 5; i++) {
            System.out.print("Nama Kegiatan-" + i + ": ");
            String namaKegiatan = sc.nextLine();

            System.out.print("Masukkan poin SSKM: ");
            int poinSSKM = sc.nextInt();
            sc.nextLine(); 

            // Menambahkan data ke riwayat untuk output nanti
            riwayatKegiatan += namaKegiatan + " = " + poinSSKM + " poin\n";
            
            // Menjumlahkan poin
            total += poinSSKM;
            
            System.out.println("-----------------------------------");
        }

        // Output hasil akhir
        System.out.println("\n--- Ringkasan SSKM ---");
        System.out.print(riwayatKegiatan);
        System.out.println("Total = " + total + " poin");

        sc.close();
    }
}
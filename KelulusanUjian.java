import java.util.Scanner;

public class KelulusanUjian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah peserta (minimal 5): ");
        int jumlahPeserta = input.nextInt();

        if (jumlahPeserta < 5) {
            System.out.println("Jumlah peserta minimal harus 5 orang.");
            return;
        }

        System.out.print("Masukkan nilai minimum kelulusan: ");
        double nilaiMinimum = input.nextDouble();
        input.nextLine(); 

        String[] namaPeserta = new String[jumlahPeserta];
        double[] nilaiPeserta = new double[jumlahPeserta];

        System.out.println("\n--- Input Data Peserta ---");
        for (int i = 0; i < jumlahPeserta; i++) {
            System.out.print("Masukkan nama peserta ke-" + (i + 1) + ": ");
            namaPeserta[i] = input.nextLine();
            System.out.print("Masukkan nilai " + namaPeserta[i] + ": ");
            nilaiPeserta[i] = input.nextDouble();
            input.nextLine(); 
        }

        int jumlahLulus = 0;
        int jumlahGagal = 0;

        System.out.println("\n--- Hasil Kelulusan ---");
        System.out.println("-------------------------------------------");
        System.out.printf("%-15s | %-10s | %-10s\n", "Nama", "Nilai", "Status");
        System.out.println("-------------------------------------------");

        for (int i = 0; i < jumlahPeserta; i++) {
            String status;
            if (nilaiPeserta[i] >= nilaiMinimum) {
                status = "LULUS";
                jumlahLulus++;
            } else {
                status = "GAGAL";
                jumlahGagal++;
            }
            System.out.printf("%-15s | %-10.2f | %-10s\n", namaPeserta[i], nilaiPeserta[i], status);
        }

        System.out.println("-------------------------------------------");
        System.out.println("Total Peserta LULUS: " + jumlahLulus);
        System.out.println("Total Peserta GAGAL: " + jumlahGagal);
        
        input.close();
    }
}
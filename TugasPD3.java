import java.util.Scanner;

public class TugasPD3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== PROGRAM PENGHITUNG IP SEMESTER ===");
        
        try {
            System.out.print("Masukkan jumlah mata kuliah: ");
            int jumlahMK = input.nextInt();

            double totalPoin = 0;
            int totalSKS = 0;

            for (int i = 1; i <= jumlahMK; i++) {
                System.out.println("\nMata Kuliah ke-" + i);
                System.out.print("  SKS : ");
                int sks = input.nextInt();
                
                System.out.print("  Nilai Huruf (A/B/C/D/E): ");
                String nilaiHuruf = input.next().toUpperCase();

                double bobot = tentukanBobot(nilaiHuruf);
                
                // Rumus: Sum (Ki * Ni)
                totalPoin += (sks * bobot);
                // Rumus: Sum (Ki)
                totalSKS += sks;
            }

            if (totalSKS == 0) {
                System.out.println("Error: Total SKS tidak boleh nol.");
            } else {
                // Perhitungan IP sesuai rumus di gambar
                double ip = totalPoin / totalSKS;
                int maksSKS = tentukanMaksSKS(ip);

                System.out.println("\n" + "=".repeat(35));
                System.out.println("HASIL PERHITUNGAN");
                System.out.println("=".repeat(35));
                System.out.printf("Total SKS Diambil : %d\n", totalSKS);
                System.out.printf("IP Semester Anda  : %.2f\n", ip);
                System.out.println("Batas SKS Maksimal: " + maksSKS + " SKS");
                System.out.println("=".repeat(35));
            }

        } catch (Exception e) {
            System.out.println("Terjadi kesalahan input. Pastikan memasukkan data yang benar.");
        } finally {
            input.close();
        }
    }

    // Fungsi untuk menentukan Ni (Bobot Nilai)
    public static double tentukanBobot(String nilai) {
        switch (nilai) {
            case "A" : return 4.0;
            case "B+": return 3.5;
            case "B" : return 3.0;
            case "C+": return 2.5;
            case "C" : return 2.0;
            case "D" : return 1.0;
            default : return 0.0; //dianggap E 
        }
    }

    // Fungsi untuk menentukan batas SKS semester berikutnya
    public static int tentukanMaksSKS(double ip) {
        if (ip >= 3.00) return 24;
        else if (ip >= 2.50) return 21;
        else if (ip >= 2.00) return 18;
        else return 15;
    }
}
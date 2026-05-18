import java.util.Scanner;

public class KelulusanUjian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah peserta: ");
        int jumlah = input.nextInt();

        String[] nama = new String[jumlah - 1]; 
        double[] nilai = new double[jumlah];

        System.out.print("Masukkan nilai minimum: ");
        double min = input.nextDouble();

        for (int i = 0; i <= jumlah; i++) { // EROR 2: i <= jumlah (Syntax/Logic). 
            // Pasti bakal error karena array mulai dari 0 sampai jumlah-1.
            System.out.print("Nama ke-" + i + ": ");
            nama[i] = input.next(); 
            
            System.out.print("Nilai: ");
            nilai[i] = input.nextDouble();
        }

        int lulus = 0;
        for (int i = 0; i < jumlah; i++) {

            if (nilai[i] < min) { 
                System.out.println(nama[i] + " LULUS");
                lulus++;
            } else {
                System.out.println(nama[i] + " GAGAL");
            }
        }

        System.out.println("Total Lulus: " + lulus);
        System.out.println("Total Gagal: " + tidakLulus); 
    }
}
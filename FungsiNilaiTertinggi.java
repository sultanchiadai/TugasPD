import java.util.Scanner;

public class FungsiNilaiTertinggi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahData = 0;

        while(jumlahData < 5) {
            System.out.print("Masukkan jumlah data yang diinginkan (minimal 5): ");
            jumlahData = input.nextInt();

            if (jumlahData < 5) {
                System.out.println("Error: Jumlah data tidak boleh kurang dari 5:\n");
            }
        }

        int[] dataArr = new int[jumlahData];

        System.out.println("\nMasukkan nilai untuk setiap urutan:");
        for (int i = 0; i < jumlahData; i++) {
            System.out.print("Data ke-" + (i + 1) + "; ");
            dataArr[i] = input.nextInt();
        }

        int maxNilai = dataArr[0];
        int maxIndeks = 0;

        for (int i = 1; i < dataArr.length; i++) {
            if (dataArr[i] > maxNilai) {
                maxNilai = dataArr[i];
                maxIndeks = i;
            }
        }

        System.out.println("\n=== HASIL PENCARIAN ===");
        System.out.println("Nilai tertinggi adalah : " + maxNilai);
        System.out.println("Posisi indeks array-nya : " + maxIndeks);

        input.close();
    }
}
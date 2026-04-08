import java.util.Scanner;

public class MieWacoan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi Variabel (Gunakan satu set nama yang konsisten)
        String menu, metodeOrder = "", levelTeks = "";
        int hargaDasar = 0;
        int levelPedas = 0;
        int biayaKemas = 0;
        int noMeja = 0;
        int totalBayar = 0;

        System.out.println("=== SISTEM KASIR MIE WACOAN SURABAYA ===");
        System.out.println("Menu: Mie Gacoan, Mie Hompimpa, Mie Suit, Dimsum, Aneka Minuman");

        System.out.print("Masukkan nama menu: ");
        menu = input.nextLine();

        switch (menu.toLowerCase()) {
            case "mie gacoan":
            case "mie hompimpa":
                hargaDasar = 13000;
                System.out.print("Masukkan level pedas (1-8): ");
                levelPedas = input.nextInt();
                input.nextLine(); // Bersihkan buffer
                if (levelPedas >= 5 && levelPedas <= 8) {
                    levelTeks = "(Sangat Pedas - Rekomendasi!)";
                }
                break;
            case "mie suit":
                hargaDasar = 10000;
                break;
            case "dimsum":
                hargaDasar = 9000;
                break;
            case "aneka minuman":
                hargaDasar = 5000;
                break;
            default:
                System.out.println("Maaf, menu tidak tersedia.");
                return; 
        }

        System.out.println("\nMetode Order:");
        System.out.println("1. Dine In");
        System.out.println("2. Take Away (Charge +Rp 2.000)");
        System.out.print("Pilih (1/2): ");
        int pilih = input.nextInt(); // Nama variabel disamakan

        if (pilih == 1) {
            metodeOrder = "Dine In";
            biayaKemas = 0;
            System.out.print("Masukkan Nomor Meja: ");
            noMeja = input.nextInt();
        } else if (pilih == 2) {
            metodeOrder = "Take Away";
            biayaKemas = 2000;
        } else {
            metodeOrder = "Unknown (Default Dine In)";
            biayaKemas = 0;
        }

        totalBayar = hargaDasar + biayaKemas;

        System.out.println("\n==============================");
        System.out.println("       NOTA MIE WACOAN");
        System.out.println("==============================");
        System.out.println("Item         : " + menu);
        if (levelPedas > 0) {
            System.out.println("Level        : " + levelPedas + " " + levelTeks);
        }
        System.out.println("Metode       : " + metodeOrder);
        if (pilih == 1) {
            System.out.println("No. Meja     : " + noMeja);
        }
        System.out.println("------------------------------");
        System.out.println("Harga Menu   : Rp " + hargaDasar);
        System.out.println("Biaya Kemas  : Rp " + biayaKemas);
        System.out.println("TOTAL BAYAR  : Rp " + totalBayar);
        System.out.println("==============================");

        input.close();
    }
}
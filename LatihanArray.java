import java.util.Scanner;

public class LatihanArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        String[] kategori = new String[0];
        int[] harga = new int[0];
        int[] jumlahBeli = new int[0]; 
        
        int menu = 0, jumlahData = 0;

        do {
            System.out.println("\n=== Pemesanan Tiket Surabaya Zoo ===");
            System.out.println("1. Input kategori dan harga");
            System.out.println("2. Input jumlah beli");
            System.out.println("3. Lihat total bayar");
            System.out.println("4. Keluar program");
            System.out.print("Pilih menu : ");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.print("Berapa jumlah kategori data : ");
                    jumlahData = sc.nextInt();
                    sc.nextLine(); 

                    kategori = new String[jumlahData];
                    harga = new int[jumlahData];
                    jumlahBeli = new int[jumlahData]; 

                    for (int i = 0; i < jumlahData; i++) {
                        System.out.print("Input kategori ke-" + (i + 1) + " : ");
                        kategori[i] = sc.nextLine();
                        System.out.print("Input harga : ");
                        harga[i] = sc.nextInt();
                        sc.nextLine(); 
                    }
                    break;

                case 2:
                    // alternatif array
                    if (kategori.length == 0) {
                        System.out.println("Isi menu 1 dulu!");
                    } else {
                        totalBayarAkhir = 0; 
                        for (int i = 0; i < kategori.length; i++) {
                            System.out.print("Jumlah beli untuk " + kategori[i] + ": ");
                            int jumlahTemp = sc.nextInt(); 
                            

                            totalBayarAkhir += (harga[i] * jumlahTemp); 
                        }
                        System.out.println("Data jumlah beli telah diproses.");
                    }
                    break;

                case 3:
                    if (kategori.length == 0) {
                        System.out.println("Data masih kosong!");
                    } else {
                        int totalKeseluruhan = 0;
                        System.out.println("\n--- Rincian Pembayaran ---");
                        for (int i = 0; i < kategori.length; i++) {
                            int subTotal = harga[i] * jumlahBeli[i];
                            System.out.println(kategori[i] + " : " + jumlahBeli[i] + " tiket x Rp " + harga[i] + " = Rp " + subTotal);
                            totalKeseluruhan += subTotal;
                        }
                        System.out.println("--------------------------");
                        System.out.println("TOTAL BAYAR : Rp " + totalKeseluruhan);
                    }
                    break;

                case 4:
                    System.out.println("Terima kasih!");
                    System.exit(0);
                    break;
                
                default:
                    System.out.println("Menu tidak tersedia.");
            }
        } while (true);
    }
}

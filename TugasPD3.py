def hitung_bobot(nilai_huruf):
    nilai_huruf = nilai_huruf.upper()
    dict_nilai = {'A': 4.0, 'B': 3.0, 'C': 2.0, 'D': 1.0, 'E': 0.0}
    return dict_nilai.get(nilai_huruf, 0.0)

def tentukan_maks_sks(ip):
    if ip >= 3.00:
        return 24
    elif ip >= 2.50:
        return 21
    elif ip >= 2.00:
        return 18
    else:
        return 15

def main():
    print("=== Program Penghitung IP Semester ===")
    
    try:
        jumlah_mk = int(input("Masukkan jumlah mata kuliah: "))
        total_poin = 0
        total_sks = 0

        for i in range(jumlah_mk):
            print(f"\nMata Kuliah ke-{i+1}")
            sks = int(input(f"  SKS: "))
            nilai = input(f"  Nilai Huruf (A/B/C/D/E): ")
            
            bobot = hitung_bobot(nilai)
            total_poin += (bobot * sks)
            total_sks += sks

        if total_sks == 0:
            print("\nError: Total SKS tidak boleh nol.")
            return

        ip = total_poin / total_sks
        maks_sks = tentukan_maks_sks(ip)

        print("\n" + "="*30)
        print(f"Total SKS Diambil : {total_sks}")
        print(f"IP Semester Anda  : {ip:.2f}")
        print(f"Maksimal SKS yang dapat diambil selanjutnya: {maks_sks} SKS")
        print("="*30)

    except ValueError:
        print("Input tidak valid. Harap masukkan angka untuk SKS dan jumlah MK.")

if __name__ == "__main__":
    main()
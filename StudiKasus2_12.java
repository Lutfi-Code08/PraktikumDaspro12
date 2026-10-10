import  java.util.Scanner;

public class StudiKasus2_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, jenis;
        int jumlahDokumen, peringkatJuara, statusPendanaan;

        System.out.println("Nama mahasiswa : ");
        nama = sc.nextLine();
        System.out.println("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA : ");
        jenis = sc.nextLine();

        if (jenis.equalsIgnoreCase("BELMAWA") ||
            jenis.equalsIgnoreCase("BAKORMA") ||
            jenis.equalsIgnoreCase("MANDIRI")) {

            System.out.print("Jumlah dokumen : ");
            jumlahDokumen = sc.nextInt();
            System.out.print("Peringkat juara ; ");
            peringkatJuara = sc.nextInt();
            
            if (peringkatJuara >= 1 && peringkatJuara <= 3 ) {
                if (jumlahDokumen == 4) {
                    System.out.println("Status : Berhak menerima dana penghargaan.");
                } else {
                    int kurang = 4 - jumlahDokumen;
                    System.out.println("Status : Dokumen tidak lengkap (kurang" + kurang + " dokumen). Dana penghargaan tidak diberikan");
                }
            } else {
                System.out.println("Status : hanya peraih juara 1, 2, atau 3 yang memperoleh dana penghargaan");
            }
        }
    }
}
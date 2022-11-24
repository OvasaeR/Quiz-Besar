package quiz2;

/**
 *
 * @author ovasae
 */
public class main {

    public static void main(String args[]) {
        Integer pilihan = 0;

        pendataan p = new pendataan();

        System.out.println("==========================================");
        System.out.println("Pendataan dan Pembayaran Iuran Warga");
        System.out.println("==========================================");
        System.out.println("1. Input Data Warga");
        System.out.println("2. Input Iuran Warga");
        System.out.println("PILIHAN MENU : ");
        System.out.println("-------------------o0o------------------------");

        if (pilihan == 1) {
            System.out.println("*** Data Warga ***");
            System.out.println("Masukan Nama: ");
            p.nama = "Hardiyanto";
            System.out.println("Masukan NIK: ");
            p.nik = "23100879";
            System.out.println("Masukan Alamat: ");
            p.alamat = "Blok A No.10";
            System.out.println("Masukan NoTlp: ");
            System.out.println("------------------o0o-----------------------");
            System.out.println("*** Data Pekerjaan ***");
            System.out.println("Masukan Pekerjaan: ");
            System.out.println("Masukan Alamat Kantor: ");
            System.out.println("------------------o0o-----------------------");
            System.out.println("*** Data Status ***");
            System.out.println("Masukan Status : Menikah");
            System.out.println("Masukan Nama Suami/Istri: ");
            System.out.println("Masukan Jumlah Anak: ");

        }
    }
}

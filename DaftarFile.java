import java.io.File;

public class DaftarFile {
    public static void main(String[] args) {
        var direktori = new File("../../Praktikum");

        // mengambil daftar file dan direktori di dalam direktori yang ditentukan menggunakan list()
        String[] daftarNama = direktori.list();
        if (daftarNama != null) {
            System.out.println("Daftar file dan direktori:");
            for (String namaFile : daftarNama) {
                System.out.println(namaFile);
            }
        } else {
            System.out.println("Direktori tidak ditemukan atau bukan direktori.");
        }
    }
}

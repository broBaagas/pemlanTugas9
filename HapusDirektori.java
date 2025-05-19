import java.io.File;

public class HapusDirektori {
    public static void main(String[] args) {
        File direktori = new File("Dump");

        // Mengecek apakah direktori ada dan jika ada, menghapus semua file di dalamnya
        if (direktori.isDirectory()) {
            File[] files = direktori.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isFile()) {
                        file.delete();
                    }
                }
            }
            // Menghapus direktori setelah semua file di dalamnya dihapus
            if (direktori.delete()) {
                System.out.println("Direktori dan semua file berhasil dihapus.");
            } else {
                System.out.println("Gagal menghapus direktori.");
            }
        } else {
            System.out.println("Bukan direktori.");
        }
    }
}

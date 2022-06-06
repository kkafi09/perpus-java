import Repository.Buku;
import Repository.Siswa;
import Service.Peminjaman;
import View.Laporan;
import View.Perpus;

public class PerpustakaanApp {
    public static void main(String[] args) {
        Siswa siswa = new Siswa();
        Buku buku = new Buku();
        Peminjaman peminjaman = new Peminjaman();
        Laporan laporan = new Laporan();

       Perpus.start(laporan, buku,siswa,peminjaman);
    }
}

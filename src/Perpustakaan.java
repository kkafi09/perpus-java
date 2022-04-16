public class Perpustakaan {
    public static void main(String[] args) {
        Siswa siswa = new Siswa();
        Buku buku = new Buku();
        Peminjaman peminjaman = new Peminjaman();
        Laporan laporan = new Laporan();

        laporan.laporan(buku);
        laporan.laporan(siswa);
        laporan.laporan(peminjaman, buku);
        peminjaman.prosesPeminjaman(siswa, peminjaman, buku);

        laporan.laporan(buku);
        laporan.laporan(siswa);
        laporan.laporan(peminjaman, buku);
    }
}

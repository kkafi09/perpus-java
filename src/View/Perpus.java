package View;

import Repository.Buku;
import Repository.Siswa;
import Service.Peminjaman;

public class Perpus {

    public static void start(Laporan laporan, Buku buku, Siswa siswa, Peminjaman peminjaman) {
        laporan.laporan(buku);
        laporan.laporan(siswa);
        laporan.laporan(peminjaman, buku);

        peminjaman.prosesPeminjaman(siswa, peminjaman, buku);

        laporan.laporan(buku);
        laporan.laporan(siswa);
        laporan.laporan(peminjaman, buku);
    }
}

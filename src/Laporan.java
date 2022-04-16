public class Laporan {

    public void laporan(Buku buku){
        int total = buku.getTotalBuku();

        System.out.println();
        System.out.println("Tabel Buku");
        System.out.println();
        System.out.println("No Nama Buku     \t\tStok \t\tHarga");
        for (int i = 0; i < total; i++) {
            System.out.println((i+1) + ". " + buku.getNamaBuku(i) + "       \t" + buku.getStok(i) + "\t\t\t" + buku.getHarga(i));
        }        
    }

    public void laporan(Siswa siswa){
        int total = siswa.getTotalSiswa();

        System.out.println();
        System.out.println("Daftar Nama siswa");
        System.out.println();
        System.out.println("No Nama Siswa \tAlamat \t\tTelepon \t\tStatus");
        for (int i = 0; i < total; i++) {
            System.out.println((i + 1) + ". " + siswa.getNamaSiswa(i) + "\t\t" + siswa.getAlamat(i) + "\t" + siswa.getTelepon(i) + "\t" + siswa.getStatus(i));
        }
    }

    public void laporan(Peminjaman peminjaman, Buku buku){
        int total = peminjaman.getTotalId();

        System.out.println();
        System.out.println("Laporan Transaksi");
        System.out.println();
        System.out.println("No Nama Buku   \tQty \tHarga \tTotal");
        int price = 0;
        for (int i = 0; i < total; i++) {
            price = 0;
            int jumlah = peminjaman.getBanyak(i) * buku.getHarga(peminjaman.getIdBuku(i));
            price += jumlah;

            System.out.println((i+1) + ". " + buku.getNamaBuku(i) + "\t" + peminjaman.getBanyak(i) + "\t    " + buku.getHarga(peminjaman.getIdBuku(i)) + "\t" + price);
        }
    }
}

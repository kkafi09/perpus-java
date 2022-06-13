package Service;

import Repository.Buku;
import Repository.Siswa;
import Util.InputUtil;

import java.util.ArrayList;

public class Peminjaman {

    private ArrayList<Integer> idSiswa = new ArrayList<>();
    private ArrayList<Integer> idBuku = new ArrayList<>();
    private ArrayList<Integer> banyak = new ArrayList<>();

    public Peminjaman() {
        this.idSiswa.add(0);
        this.idBuku.add(1);
        this.banyak.add(1);

        this.idSiswa.add(1);
        this.idBuku.add(1);
        this.banyak.add(1);

        this.idSiswa.add(2);
        this.idBuku.add(2);
        this.banyak.add(2);
    }

    public void prosesPeminjaman(Siswa siswa, Peminjaman peminjaman, Buku buku) {
        int tempIdSiswa = 0;
        System.out.println("\nSELAMAT DATANG DI PERPUSTAKAAN SMK TELKOM MALANG");
        do {
            tempIdSiswa = InputUtil.inputInt("Masukkan id siswa") - 1;

            if (!siswa.getStatus(tempIdSiswa))
                System.err.println("Siswa tidak bisa meminjam buku, karena telah meminjam buku");

        } while (!siswa.getStatus(tempIdSiswa));

        System.out.println("Selamat datang " + siswa.getNama(tempIdSiswa));
        int i = 0;
        int temp = 0;
        ArrayList<Integer> idBuku = new ArrayList<>();
        ArrayList<Integer> banyak = new ArrayList<>();

        do {
            temp = InputUtil.inputInt("Masukkan kode Buku") - 1;

            if (temp != 98) {
                idBuku.add(temp);
                banyak.add(InputUtil.inputInt(buku.getNamaBuku(idBuku.get(i)).replaceAll(" ", "") + " sebanyak"));
                i++;
            }
        } while (temp != 98);

        System.out.println("Peminjaman buku oleh " + siswa.getNama(tempIdSiswa) + " sebagai berikut : ");
        System.out.println("Nama buku \t\tIdBuku \tHarga \tJumlah \t");

        int total = 0;
        int x = idBuku.size();
        for (int j = 0; j < x; j++) {
            int sum = banyak.get(j) * buku.getHarga(idBuku.get(j));
            total += sum;
            System.out.println(buku.getNamaBuku(idBuku.get(j)) + "\t\t" + idBuku.get(j) + "\t" + buku.getHarga(idBuku.get(j)) + "\t" + sum + "\t" + banyak.get(j));
            peminjaman.setPeminjaman(buku, tempIdSiswa, idBuku.get(j), banyak.get(j));
        }

        System.out.println("Total Belanja : " + total);
        if (!siswa.getStatus(tempIdSiswa)) {
            System.err.println("Siswa tidak boleh meminjam buku lagi");
            System.err.println("Jika buku telah di kembalikan, siswa dapat meminjam buku!");
        }
        siswa.editStatus(tempIdSiswa, false);

    }

    public void setPeminjaman(Buku buku, int idSiswa, int idBuku, int banyak) {
        this.idSiswa.add(idSiswa);
        this.idBuku.add(idBuku);
        this.banyak.add(banyak);
        buku.editStok(idBuku, buku.getStok(idBuku) - banyak);
    }

    public int getIdSiswa(int id) {
        return this.idSiswa.get(id);
    }

    public int getIdBuku(int id) {
        return this.idBuku.get(id);
    }

    public int getBanyak(int id) {
        return this.banyak.get(id);
    }

    public int getTotalId() {
        return this.idSiswa.size();
    }
}

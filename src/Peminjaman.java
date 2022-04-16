import java.util.ArrayList;
import java.util.Scanner;

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
        Scanner sc = new Scanner(System.in);
        int idSiswa = 0;
        System.out.println("SELAMAT DATANG DI PERPUSTAKAAN KITA");
        do{
            System.out.print("\nMasukkan ID Siswa : ");
            idSiswa = sc.nextInt();

            if(!siswa.getStatus(idSiswa)) System.err.println("Siswa tidak bisa meminjam buku, karena telah meminjam buku");
        } while (!siswa.getStatus(idSiswa));

        System.out.println("Selamat datang " + siswa.getNamaSiswa(idSiswa));
        ArrayList<Integer> idBuku = new ArrayList<>();
        ArrayList<Integer> banyak = new ArrayList<>();
        int i = 0;
        int temp = 0;

        do{
            System.out.print("Masukkan kode Buku : ");
            temp = sc.nextInt();
            if(temp != 99){
                idBuku.add(temp);
                System.out.print(buku.getNamaBuku(idBuku.get(i)) + " sebanyak : ");
                banyak.add(sc.nextInt());
                i++;
            }
        } while(temp != 99);

        System.out.println("Peminjaman Buku oleh " + siswa.getNamaSiswa(idSiswa) + " sebagai berikut : ");
        System.out.println("Nama buku \t\tIdBuku \tHarga \tJumlah \t");

        int total = 0;
        int x = idBuku.size();
        for(int j= 0;j < x; j++){
            int sum = banyak.get(j) * buku.getHarga(idBuku.get(j));
            total += sum;
            System.out.println(buku.getNamaBuku(idBuku.get(j)) + "\t\t" + idBuku.get(j) + "\t" + buku.getHarga(idBuku.get(j)) + "\t" + sum + "\t" + banyak.get(j));
            peminjaman.setPeminjaman(buku, idSiswa, idBuku.get(j), banyak.get(j));
        }

        System.out.println("Total Belanja : " + total);
        siswa.editStatus(idSiswa, false);
        if(!siswa.getStatus(idSiswa)){
            System.err.println("tidak boleh meminjam buku sampai buku dikemabalikan");
        }
    }

    public void setPeminjaman(Buku buku, int idSiswa, int idBuku, int banyak){
        this.idSiswa.add(idSiswa);
        this.idBuku.add(idBuku);
        this.banyak.add(banyak);
        buku.editStok(idBuku, buku.getStok(idBuku) - banyak);
    }

    public int getIdSiswa(int id){
        return this.idSiswa.get(id);
    }

    public int getIdBuku(int id){
        return this.idBuku.get(id);
    }

    public int getBanyak(int id){
        return this.banyak.get(id);
    }

    public int getTotalId(){
        return this.idSiswa.size();
    }
}

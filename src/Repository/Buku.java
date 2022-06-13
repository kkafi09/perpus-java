package Repository;

import Util.FormatString;

import java.io.Serializable;
import java.util.ArrayList;

public class Buku implements Serializable {

    private ArrayList<String> namaBuku = new ArrayList<>();
    private ArrayList<Integer> stok = new ArrayList<>();
    private ArrayList<Integer> harga = new ArrayList<>();

    private Integer id, price;
    private String title, author;

//    public Buku() {
//        this.namaBuku.add("Tentang Kamu");
//        this.stok.add(1);
//        this.harga.add(66000);
//
//        this.namaBuku.add("Azzamine");
//        this.stok.add(1);
//        this.harga.add(76000);
//
//        this.namaBuku.add("Atomic habit");
//        this.stok.add(1);
//        this.harga.add(56000);
//
//        this.namaBuku.add("Si Doel");
//        this.stok.add(1);
//        this.harga.add(76000);
//
//        this.namaBuku.add("5 AM rule");
//        this.stok.add(1);
//        this.harga.add(76000);
//    }

    public Buku(Integer id, String title, String author, Integer price) {
        this.id = id;
        this.price = price;
        this.title = title;
        this.author = author;
    }

    public Buku(){
        id = 0;
        title = null;
        price = null;
        author = null;
    }

    @Override
    public String toString() {
        return (id + 1) + ". " + FormatString.formatStr(title, 12) + "\t" + author + "\t" + price + "\n";
    }

    public int getTotalBuku() {
        return this.namaBuku.size();
    }

    public void setNamaBuku(String namaBuku) {
        this.namaBuku.add(namaBuku);
    }

    public String getNamaBuku(int id) {
        return this.namaBuku.get(id);
    }

    public void setStok(Integer stok) {
        this.stok.add(stok);
    }

    public int getStok(int id) {
        return this.stok.get(id);
    }

    public void editStok(int id, Integer stok) {
        this.stok.set(id, stok);
    }

    public void setHarga(int harga) {
        this.harga.add(harga);
    }

    public int getHarga(int id) {
        return this.harga.get(id);
    }
}

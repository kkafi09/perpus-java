import java.util.ArrayList;

public class Buku {

    private ArrayList<String> namaBuku = new ArrayList<>();
    private ArrayList<Integer> stok = new ArrayList<>();
    private ArrayList<Integer> harga = new ArrayList<>();

    public Buku() {
        this.namaBuku.add("Tentang Kamu");
        this.stok.add(1);
        this.harga.add(66000);

        this.namaBuku.add("Azzamine    ");
        this.stok.add(1);
        this.harga.add(76000);

        this.namaBuku.add("Atomic habit");
        this.stok.add(1);
        this.harga.add(56000);

        this.namaBuku.add("Si Doel     ");
        this.stok.add(1);
        this.harga.add(76000);

        this.namaBuku.add("5 AM rule   ");
        this.stok.add(1);
        this.harga.add(76000);
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

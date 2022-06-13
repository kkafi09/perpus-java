package Repository;

import java.util.ArrayList;

public class Petugas {
    private ArrayList<String> namaKaryawan = new ArrayList<>();
    private ArrayList<String> alamat = new ArrayList<>();
    private ArrayList<String> telepon = new ArrayList<>();

    private String id, name, address, phoneNumber;

    @Override
    public String toString() {
        return "Petugas{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public Petugas(String id, String name, String address, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public Petugas() {
        this.namaKaryawan.add("Kr. Kafi1");
        this.alamat.add("Kediri");
        this.telepon.add("12345");

        this.namaKaryawan.add("Kr. Kafi2");
        this.alamat.add("Malang");
        this.telepon.add("6789");
    }

    public int getTotalKaryawan() {
        return this.namaKaryawan.size();
    }

    public void setNamaKaryawan(String nama) {
        this.namaKaryawan.add(nama);
    }

    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    public String getNamaKaryawan(int id) {
        return this.namaKaryawan.get(id);
    }

    public String getAlamat(int id) {
        return this.alamat.get(id);
    }

    public String getTelepon(int id) {
        return this.telepon.get(id);
    }

}

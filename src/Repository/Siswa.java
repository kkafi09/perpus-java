package Repository;

import java.util.ArrayList;

public class Siswa {
    private ArrayList<String> nama = new ArrayList<>();
    private ArrayList<String> alamat = new ArrayList<>();
    private ArrayList<String> telepon = new ArrayList<>();
    private ArrayList<Boolean> status = new ArrayList<>();

    private String id, name, address, phoneNumber, studentStatus;

    public Siswa(String id, String name, String address, String phoneNumber, String studentStatus) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.studentStatus = studentStatus;
    }

    @Override
    public String toString() {
        return "Siswa{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", studentStatus='" + studentStatus + '\'' +
                '}';
    }

    public Siswa() {
        this.nama.add("Kafi #1");
        this.alamat.add("Indonesia");
        this.telepon.add("085717927900");
        this.status.add(true);

        this.nama.add("Kafi #2");
        this.alamat.add("Amerika");
        this.telepon.add("0857179279000");
        this.status.add(true);
    }

    public boolean getStatus(int id) {
        return this.status.get(id);
    }

    public void setStatus(boolean status) {
        this.status.add(status);
    }

    public void editStatus(int id, boolean status) {
        this.status.set(id, status);
    }

    public int getTotalSiswa() {
        return this.nama.size();
    }

    public void setNama(String nama) {
        this.nama.add(nama);
    }

    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    public String getNama(int id) {
        return this.nama.get(id);
    }

    public String getAlamat(int id) {
        return this.alamat.get(id);
    }

    public String getTelepon(int id) {
        return this.telepon.get(id);
    }


}

import java.util.ArrayList;

public class Siswa {
    private ArrayList<String> namaSiswa = new ArrayList<>();
    private ArrayList<String> alamat = new ArrayList<>();
    private ArrayList<String> telepon = new ArrayList<>();
    private ArrayList<Boolean> status = new ArrayList<>();

    public Siswa() {
        this.namaSiswa.add("Kafi #1");
        this.alamat.add("Indonesia");
        this.telepon.add("085717927900");
        this.status.add(true);

        this.namaSiswa.add("Kafi #2");
        this.alamat.add("Amerika  ");
        this.telepon.add("0857179279000");
        this.status.add(false);
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
        return this.namaSiswa.size();
    }

    public void setNamaSiswa(String nama) {
        this.namaSiswa.add(nama);
    }

    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    public String getNamaSiswa(int id) {
        return this.namaSiswa.get(id);
    }

    public String getAlamat(int id) {
        return this.alamat.get(id);
    }

    public String getTelepon(int id) {
        return this.telepon.get(id);
    }


}

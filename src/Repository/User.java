package Repository;

public interface User {

    void setNama(String nama);

    String getNama(int id);

    void setAlamat(String alamat);

    String getAlamat(int id);

    void setTelepon(String telepon);

    String getTelepon(int id);
}

package Repository;

import java.io.Serializable;

public class Petugas implements Serializable {

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
    }
}

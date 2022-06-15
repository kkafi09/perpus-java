package Repository;

import Util.FormatString;

import java.io.Serializable;

public class Siswa implements Serializable {
    private int id;
    private String name, address, phoneNumber;
    private boolean studentStatus;

    public Siswa(int id, String name, String address, String phoneNumber, boolean studentStatus) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.studentStatus = studentStatus;
    }

    public Siswa() {
    }

    @Override
    public String toString() {
        return id + "\t" + FormatString.formatStr(name, 12) + "\t" + FormatString.formatStr(address, 12) + "\t" + FormatString.formatStr(phoneNumber, 12) + "\t" + studentStatus + "\n";
    }

}

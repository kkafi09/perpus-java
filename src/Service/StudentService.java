package Service;

import Repository.Siswa;
import Util.InputUtil;

import java.io.*;

public class StudentService {
    LibraryService libraryService = new LibraryService();
    String filename = "datasiswa.txt";

    public void loadDataSiswa(){
        File file = new File(filename);

       if(file.exists()){
           try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filename))){
               libraryService = (LibraryService) inputStream.readObject();
           } catch (IOException | ClassNotFoundException exception) {
               exception.printStackTrace();
           }
       } else{
           System.out.println("File not Found, Tambahkan data terlebih dahulu");
           add();
       }
    }

    public void add(){
        int id = InputUtil.inputInt("Masukkan id siswa");
        String nama = InputUtil.inputStr("Masukkan nama siswa");
        String address = InputUtil.inputStr("Masukkan alamat siswa");
        String phoneNumber = InputUtil.inputStr("Masukkan no telepon siswa");
        boolean status = InputUtil.inputBool("Masukkan status siswa, (true/false)");

        Siswa siswa= new Siswa(id, nama , address, phoneNumber, status);
        libraryService.addStudent(siswa);
        save();
    }

    public void save() {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filename))) {
            objectOutputStream.writeObject(libraryService);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public void show(){
        loadDataSiswa();
        System.out.println("id \tNama siswa \tAlamat \tTelepon \tStatus");
        System.out.println(libraryService.showSiswa());
    }

    public void delete(){
        loadDataSiswa();
        show();

        int id = InputUtil.inputInt("Masukkan no siswa yang akan dihapus");
        libraryService.deleteSiswa(id);

        save();
    }
}

package Service;

import Repository.Buku;
import Repository.Siswa;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class LibraryService implements Serializable {
    private List<Buku> listBuku;
    private List<Siswa> listSiswa;

    public LibraryService() {
        listBuku = new ArrayList<>();
        listSiswa = new ArrayList<>();
    }

    public void addBook(Buku buku) {
        listBuku.add(buku);
    }

    public void deleteBook(int id) {
        listBuku.remove(id);
    }

    public String showBook() {
        return new LibraryService().toString(listBuku);
    }

    public void addStudent(Siswa siswa){
        listSiswa.add(siswa);
    }

    public void deleteSiswa(int id){
        listSiswa.remove(id);
    }

    public String showSiswa(){
        return new LibraryService().toString(listSiswa);
    }

    public <T> String toString(List<T> arrayList) {
        StringBuilder total = new StringBuilder();

        for (T data : arrayList) {
            total.append(data.toString());
        }

        return total.toString();
    }
}

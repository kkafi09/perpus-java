package Service;

import Repository.Buku;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class LibraryService implements Serializable {
    private List<Buku> collection;

    public LibraryService() {
        collection = new ArrayList<>();
    }

    public void addBook(Buku buku) {
        collection.add(buku);
    }

    public void deleteBook(int id){
        collection.remove(id);
    }

    public String toString() {
        StringBuilder total = new StringBuilder();

        for (Buku buku : collection) {
            total.append(buku.toString());
        }

        return total.toString();
    }
}

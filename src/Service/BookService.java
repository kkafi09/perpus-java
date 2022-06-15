package Service;

import Repository.Buku;
import Util.InputUtil;

import java.io.*;

public class BookService {
    LibraryService libraryService = new LibraryService();
    String database = "databuku.txt";

    public void loadDataBuku() {
        File file = new File(database);

        if (file.exists()) {
            try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(database))) {
                libraryService = (LibraryService) objectInputStream.readObject();
            } catch (IOException | ClassNotFoundException exception) {
                System.err.println("File gagal di load\n");

            }
        } else{
            System.out.println("File Not found, Tambahkan buku terlebih dahulu");
            add();
        }
    }

    public void add() {
        String title = InputUtil.inputStr("Enter title");
        String author = InputUtil.inputStr("Enter author");
        Integer id = InputUtil.inputInt("Enter ID book");
        Integer price = InputUtil.inputInt("Enter price");

        Buku buku = new Buku(id, title, author, price);
        libraryService.addBook(buku);
        save();
    }

    public void save() {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(database))) {
            objectOutputStream.writeObject(libraryService);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public void show() {
        loadDataBuku();
        System.out.println("Id \tNama Buku \t\tAuthor \t\t\tHarga");
        System.out.println(libraryService.showBook());
    }

    public void delete() {
        loadDataBuku();
        show();

        int id = InputUtil.inputInt("Masukkan no buku yang akan dihapus") - 1;
        libraryService.deleteBook(id);

        save();
    }
}

package Service;

import Repository.Buku;
import Util.InputUtil;

import java.io.*;

public class BookService {
    LibraryService libraryService = new LibraryService();
    String databuku = "databuku.ser";

    public void loadDataBuku() {
        File file = new File(databuku);

        if (file.exists()) {
            try (FileInputStream inputStream = new FileInputStream(file); ObjectInputStream objectInputStream = new ObjectInputStream(inputStream)) {
                libraryService = (LibraryService) objectInputStream.readObject();
            } catch (IOException | ClassNotFoundException exception) {
                exception.printStackTrace();
            }
        } else{
            System.out.println("File Not found");
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
        try (FileOutputStream outputStream = new FileOutputStream(databuku); ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream)) {
            objectOutputStream.writeObject(libraryService);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public void show() {
        loadDataBuku();
        System.out.println(libraryService.toString());
    }

    public void delete() {
        loadDataBuku();
        show();

        int id = InputUtil.inputInt("Masukkan id buku yang akan dihapus");
        libraryService.deleteBook(id);

        save();
    }
}

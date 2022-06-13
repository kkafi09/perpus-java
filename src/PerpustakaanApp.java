import Repository.Buku;
import Repository.Siswa;
import Service.BookService;
import Service.Peminjaman;
import Util.InputUtil;
import View.Laporan;
import View.Perpus;

public class PerpustakaanApp {
    public static void main(String[] args) {
//        Siswa siswa = new Siswa();
//        Buku buku = new Buku();
//        Peminjaman peminjaman = new Peminjaman();
//        Laporan laporan = new Laporan();
//
//       Perpus.start(laporan, buku,siswa,peminjaman);

        boolean run = true;
        BookService bookService = new BookService();

        while (run) {
            System.out.println("""
                    1. Show Book list
                    2. Add Book to list
                    3. Delete book from list
                    4. """);
            int answer = InputUtil.inputInt("Pick Menu");
            switch (answer) {
                case 1 -> bookService.show();
                case 2 -> bookService.add();
                case 3 -> bookService.delete();
            }
        }
    }
}

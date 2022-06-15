package View;

import Service.BookService;
import Service.StudentService;
import Util.InputUtil;

public class LibraryView {
    boolean isRunAdmin = true;
    boolean isRunStudent = true;
    boolean isLogin = true;
    StudentService studentService = new StudentService();
    BookService bookService = new BookService();

    public void start() {
        do {
            System.out.println("SELAMAT DATANG DI PERPUSTAKAAN SMK TELKOM MALANG");
            System.out.println("Silahkan login terlebih dahulu");
            String username = InputUtil.inputStr("Masukkan username");
            String password = InputUtil.inputStr("Masukkan password");

            if (username.equals("student") && password.equals("123")) {
                runAsStudent();
            } else if (username.equals("admin") && password.equals("admin")) {
                runAsAdmin();
            } else if(username.equals("exit") && password.equals("exit")){
                isLogin = false;
            } else {
                System.out.println("Username dan Password salah");
            }
        } while (isLogin);
    }

    public void runAsStudent() {
        do{
            System.out.println("""
                    1. Show Book List
                    2. Borrow book 
                    3. Return book
                    4. Exit from student account
                    """);
            int answer = InputUtil.inputInt("Pick Menu");
            switch (answer) {
                case 1 -> bookService.show();
                case 4 -> {
                    bookService.save();
                    studentService.save();
                    isRunStudent = false;
                }
            }
        } while (isRunStudent);
    }

    public void runAsAdmin() {
        do {
            System.out.println("""
                    1. Show Book list
                    2. Add Book to list
                    3. Delete book from database
                    4. Show Student list
                    5. Add Student to list
                    6. Delete student from database
                    7. Exit from admin account""");
            int answer = InputUtil.inputInt("Pick Menu");
            switch (answer) {
                case 1 -> bookService.show();
                case 2 -> bookService.add();
                case 3 -> bookService.delete();
                case 4 -> studentService.show();
                case 5 -> studentService.add();
                case 6 -> studentService.delete();
                case 7 -> {
                    bookService.save();
                    studentService.save();
                    isRunAdmin = false;
                }
            }
        } while (isRunAdmin);
    }
}

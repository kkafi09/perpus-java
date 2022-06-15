package Repository;

import Util.FormatString;

import java.io.Serializable;

public class Buku implements Serializable {
    private Integer id, price;
    private String title, author;

    public Buku(Integer id, String title, String author, Integer price) {
        this.id = id;
        this.price = price;
        this.title = title;
        this.author = author;
    }

    public Buku(){
        id = 0;
        title = null;
        price = null;
        author = null;
    }

    @Override
    public String toString() {
        return id + "\t" + FormatString.formatStr(title, 12) + "\t" + FormatString.formatStr(author, 12) + "\t" + price + "\n";
    }
}

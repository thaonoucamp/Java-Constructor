package mypackage;

public class Book {
    String name;
    String face;
    int price;

    // Constructor(Ham khoi tao-ten trung ten Class);

    // Constructor ko tham so;
    public Book() {

    }

    // Constructor co tham so;
    public Book(String name, String face) {
        // this(key) phan biet bien instance va bien tham so truyen vao;
        this.face = face;
        this.name = name;
    }

    // Constructor truyen them tham so;
    public Book(String name, String face, int price) {
        this.face = face;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", face='" + face + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

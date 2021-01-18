package mypackage;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();

        // Goi constructor mac dinh thi goi ham set tham so;
        book.setName("Book");
        book.setFace("Tieng Anh");
        book.setPrice(10000);
        System.out.println("book's :" + book.toString());

        // Goi Constructor co tham so thi phai truyen du tham so, dung kieu du lieu;
        Book book1 = new Book("Book 1", "English", 10000);
        System.out.println("book1's :" + book1.toString());

    }
}

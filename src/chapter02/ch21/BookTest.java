package chapter02.ch21;

public class BookTest {
    public static void main(String[] args) {
        Book[] library = new Book[5];

//        for (int i = 0; i < library.length; i++) {
//            System.out.println(library[i]);
//        }
        library[0] = new Book("태백산맥 1", "조정래");
        library[1] = new Book("태백산맥 2", "김정래");
        library[2] = new Book("태백산맥 3", "이정래");
        library[3] = new Book("태백산맥 4", "박정래");
        library[4] = new Book("태백산맥 5", "최정래");

        for (Book book : library) {
            System.out.println(book);
            book.showInfo();
        }
    }
}

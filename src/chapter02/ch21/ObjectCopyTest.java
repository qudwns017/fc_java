package chapter02.ch21;

public class ObjectCopyTest {
    public static void main(String[] args) {
        Book[] library = new Book[5];
        Book[] copy = new Book[5];

        library[0] = new Book("태백산맥 1", "조정래");
        library[1] = new Book("태백산맥 2", "김정래");
        library[2] = new Book("태백산맥 3", "이정래");
        library[3] = new Book("태백산맥 4", "박정래");
        library[4] = new Book("태백산맥 5", "최정래");

        copy[0] = new Book();
        copy[1] = new Book();
        copy[2] = new Book();
        copy[3] = new Book();
        copy[4] = new Book();

        for (int i = 0; i < library.length; i++) {
            copy[i].setAuthor(library[i].getAuthor());
            copy[i].setTitle (library[i].getTitle());
        }
//        System.arraycopy(library, 0, copy, 0, 5);

        library[0].setAuthor("박완서");
        library[0].setTitle("나들목");

        System.out.println("== library ==");
        for (Book book : library) {
            System.out.println(book);
            book.showInfo();
        }

        System.out.println("== copy ==");
        for (Book book : copy) {
            System.out.println(book);
            book.showInfo();
        }


    }
}

package chapter02.ch23;

import chapter02.ch21.Book;
import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {

        ArrayList<Book> library = new ArrayList<>();

        library.add(new Book("태백산맥 1", "조정래"));
        library.add(new Book("태백산맥 2", "김정래"));
        library.add(new Book("태백산맥 3", "이정래"));
        library.add(new Book("태백산맥 4", "박정래"));
        library.add(new Book("태백산맥 5", "최정래"));

        for (int i = 0; i < library.size(); i++) {
            library.get(i).showInfo();
        }
    }
}

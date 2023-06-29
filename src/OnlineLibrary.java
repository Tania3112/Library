import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OnlineLibrary implements General{
    ArrayList<String> onlineBook = new ArrayList<>();
    String name;
    int count;
    int i = 0;
    int book_number;
    String book_name;
    Scanner display = new Scanner(System.in);

    @Override
    public void add() {
        System.out.println("Введите сколько книг вы хотите добавить:");
        count = display.nextInt();

        while (i != count) {
            System.out.println("Введите название книги: ");
            name = display.next();
            onlineBook.add(name);

            i++;
        }
        System.out.println("Ваша библиотека состоит из: " + onlineBook);
    }

    @Override
    public void watch() {

    }

    @Override
    public void edit() {
        System.out.println( "Введите номер книги для редактирования:");
        book_number = display.nextInt();

        System.out.println( "Введите название новой книги: ");
        book_name = display.next();

        onlineBook.set(book_number - 1,book_name);
        System.out.println("Книги отредактированы: " + onlineBook);
    }

    @Override
    public void remove() {
        System.out.println( "Введите номер книги для удаления:");
        book_number = display.nextInt();
        onlineBook.remove(book_number -1);
        System.out.println("Ваша библиотека состоит из:" + onlineBook);

    }

    @Override
    public void sort() {
        Collections.sort(onlineBook);
        System.out.println("Библиотека отсортирована" + onlineBook);

    }
}

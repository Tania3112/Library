import java.util.*;

public class OfflineLibrary implements General {
    String name;
    int count;
    int i = 0;
    int book_number;
    String book_name;
    ArrayList<String> offlineBook = new ArrayList<>();
    Scanner display = new Scanner(System.in);

    public void add(){

            System.out.println("Введите сколько книг вы хотите добавить:");
            count = display.nextInt();

            while (i != count) {
                System.out.println("Введите название книги: ");
                name = display.next();
                offlineBook.add(name);

                i++;
            }
            System.out.println("Ваша библиотека состоит из: " + offlineBook);

        }

    public void edit(){

        System.out.println( "Введите номер книги для редактирования:");
        book_number = display.nextInt();

        System.out.println( "Введите название новой книги: ");
        book_name = display.next();

        offlineBook.set(book_number - 1,book_name);
        System.out.println("Книги отредактированы: " + offlineBook);
    }

    public void remove() {

        System.out.println( "Введите номер книги для удаления:");
        book_number = display.nextInt();
        offlineBook.remove(book_number -1);
        System.out.println("Ваша библиотека состоит из:" + offlineBook);

    }
    public void watch () {
        System.out.println("Библиотека:" + offlineBook);

    }

    public void sort() {
      Collections.sort(offlineBook);
        System.out.println("Библиотека отсортирована" + offlineBook);


    }

}

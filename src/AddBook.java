import java.util.ArrayList;
import java.util.Scanner;

public class AddBook {
    String name;
    int count;
    int i;

    ArrayList<String> book = new ArrayList<String>();
    Scanner display = new Scanner(System.in);


    public void add () {
        System.out.println("Введите сколько книг вы хотите добавить:");
        count = display.nextInt();

       while ( i != count ) {
           System.out.println("Введите название книги: ");
           name = display.next();
           book.add(name);
           i++;
       }
       System.out.println("Ваша библиотека состоит из: " + book);
    }
}

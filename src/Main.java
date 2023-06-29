import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String number;
        Library library = new Library();

        library.add();
        System.out.println("Введите действие которое вы хотите сделать: редактировать, просмотр, удалить");
        Scanner write = new Scanner(System.in);

        number = write.next();


        switch (number) {
            case "редактировать": library.edit();
            break;
            case "просмотр": library.watch();
            break;
            case "удалить": library.remove();
            break;

        }



    }
}
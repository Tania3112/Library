import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
String number;
AddBook add = new AddBook();
WatchLibrary watch = new WatchLibrary();
RemoveBook remove = new RemoveBook();
EditBook edit = new EditBook();

System.out.println("Введите действие которое вы хотите сделать: добавить, редактировать, просмотр, удалить");
Scanner write = new Scanner(System.in);
      number =   write.next();
        switch (number) {
            case "добавить":  add.add();
            case "редактировать": edit.edit();
            case "просмотр":
            case "удалить": remove.remove();
        }


    }
}
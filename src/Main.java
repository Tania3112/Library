import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String number;
        String book;
        Scanner write = new Scanner(System.in);

        OfflineLibrary offlineLibrary = new OfflineLibrary();
        OnlineLibrary onlineLibrary = new OnlineLibrary();
        System.out.println("Введите в какую библиотеку вы добавляете книги: онлайн, офлайн");
        book = write.next();

        switch (book) {
            case "онлайн": onlineLibrary.add();
                break;
            case "офлайн": offlineLibrary.add();
                break;

        }

        System.out.println("Введите действие которое вы хотите сделать: редактировать, просмотр, удалить, сортировка");
        number = write.next();


        if (book.equals("офлайн")) {


            switch (number) {

                case "редактировать":
                    offlineLibrary.edit();
                    break;
                case "просмотр":
                    offlineLibrary.watch();
                    break;
                case "удалить":
                    offlineLibrary.remove();
                    break;
                case "сортировка":
                    offlineLibrary.sort();


            }
        }
        if (book.equals("онлайн")){


            switch (number) {
                case "редактировать":
                    onlineLibrary.edit();
                    break;
                case "просмотр":
                    onlineLibrary.watch();
                    break;
                case "удалить":
                    onlineLibrary.remove();
                    break;
                case "сортировка":
                    onlineLibrary.sort();


            }

        }



    }

}
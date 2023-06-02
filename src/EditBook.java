public class EditBook extends AddBook{
    int book_number;
    String book_name;
    public void edit (){
        System.out.println( "Для начала добавьте книги");
        add();
    System.out.println( "Введите номер книги для редактирования:");
    book_number = display.nextInt();

    System.out.println( "Введите название новой книги: ");
    book_name = display.next();

    book.set(book_number,book_name);
    System.out.println("Книги отредактированы: " + book);

    }
}

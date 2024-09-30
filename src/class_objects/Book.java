package class_objects;

public class Book {

    static int totalBooks;

    String title;
    String author;
    String isbn;

    boolean isBorrowed;

    static{
        totalBooks = 0;
    }

    {
        totalBooks++;
    }

    static int getTotalBooks(){
        return totalBooks;
    }

    void borrowBook(){
        if(isBorrowed){
            System.out.println("Book is already borrowed");
        } else{
            this.isBorrowed = true;
            System.out.println("enjoy :" + this.title );
        }
    }

    void returnBook(){
        if(isBorrowed){
            this.isBorrowed = false;
            System.out.println("pls give a feedback, hope u enjoyed the " + this.title);
        } else {
            System.out.println("This book is already in the library");
        }
    }



    Book(String isbn,String title,String author){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    Book(String isbn){
        this(isbn,"Unknown","Umknown");
    }

    public static void main(String[] args){
        Book book1 = new Book("1","java","koushik");
        Book book2 = new Book("2");
        System.out.println(Book.getTotalBooks());
        book1.borrowBook();
        book2.borrowBook();
        book1.borrowBook();
        book1.returnBook();
        book2.returnBook();

    }
}

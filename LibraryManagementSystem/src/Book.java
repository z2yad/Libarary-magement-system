import java.time.LocalDate;
import java.util.Date;

public class Book {
    private int bookId;
    private String title;
    private String isbn;
    private LocalDate publishYear;
    private Publisher publisher ;


    public Book(int bookId, String title, String isbn, LocalDate publishYear, Publisher publisher) {
        this.bookId = bookId;
        this.title = title;
        this.isbn = isbn;
        this.publishYear = publishYear;
        this.publisher = publisher;
    }



    public int getBookId() {
        return bookId;
    }
    public String getTitle() {
        return title;
    }
    public String getIsbn() {
        return isbn;
    }
    public LocalDate getPublishYear() {
        return publishYear;
    }
    public Publisher getPublisher() {
        return publisher;
    }
 public  void setBookTitle(int bookId) {
     this.title = title;
 }
 public  void setIsbn(String isbn) {
        this.isbn = isbn;
 }
 public  void setPublishYear(LocalDate publishYear) {
        this.publishYear = publishYear;
 }
@Override
public String toString() {
        return "Book ID:" +bookId +
                ",Title:" + title+
                ",ISBN:" + isbn+
                ",Publish Year:" +publisher +
                ", Publisher: " + publisher;
}
}

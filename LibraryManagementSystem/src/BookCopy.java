public class BookCopy {
    private  int copyId;
    private  String Status;
    private  Book Book;
    public BookCopy(int copyId,String Status ,Book book) {
        this.copyId = copyId;
        this.Status = Status;
        this.Book = book;

    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public int getCopyId() {
        return copyId;
    }

    public Book getBook() {
        return Book;
    }
    @Override
    public String toString() {
        return "Book{" + "copyId=" + copyId +
                ", Status="
                + Status +
                ", Book=" + Book +
                '}';
    }
}

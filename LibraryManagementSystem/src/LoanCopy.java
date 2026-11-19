public class LoanCopy {
    private  BookCopy bookCopy;
    private  Loan loan;
    public LoanCopy(BookCopy bookCopy, Loan loan) {
        this.bookCopy = bookCopy;
        this.loan = loan;
    }

    public BookCopy getBookCopy() {
        return bookCopy;
    }

    public Loan getLoan() {
        return loan;
    }
    @Override
    public String toString() {
        return "include [bookCopy=" + bookCopy +
                ", loan=" + loan +
                "]";
    }
}

import java.time.LocalDate;

public class Loan {
    private int id;
    private LocalDate startDate;
    private LocalDate endDate;
    private LocalDate Actual_return_date;
    private Employee employee;
    private Member member;

    Loan(int id, LocalDate startDate, LocalDate endDate, LocalDate Actual_return_date , Employee employee, Member member) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.Actual_return_date = Actual_return_date;
        this.employee = employee;
        this.member = member;

    }

    public int getId() {
        return id;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public LocalDate getActual_return_date() {
        return Actual_return_date;
    }

    public void setActual_return_date(LocalDate actual_return_date) {
        Actual_return_date = actual_return_date;
    }

    public Employee getEmployee() {
        return employee;
    }


    public Member getMember() {
        return member;
    }
    @Override
    public String toString() {
        return "Loan ID: " + id
                + ", Start Date: " + startDate
                + ", End Date: " + endDate
                + ", Actual Return Date: " + Actual_return_date
                + ", Employee: " + employee
                + ", Member: " + member;
    }
}

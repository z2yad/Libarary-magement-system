import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
    Publisher pub = new Publisher(1, "Dar El-Shorouk", "Cairo, Egypt", "0123456789");
        Publisher publisher = new Publisher(2, "O'Reilly Media");

        Book book = new Book(1, "Clean Code", "6565", LocalDate.of(2008, 8, 1),publisher);
//        System.out.println(pub);
//        System.out.println(publisher);
        System.out.println(book.toString());
        Employee employee1 = new Employee(
                1, "Ahmed", "Mohamed",
                "123456", LocalDate.of(2000, 5, 10),
                "Cairo", 'M', "01012345678"
        );

        Employee employee2 = new Employee(
                2, "Omar", "Ali"
        );
    }
}
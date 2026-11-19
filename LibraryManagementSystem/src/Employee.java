import java.time.LocalDate;

    public class Employee {
    private  int EmployeeID;
    private  String FirstName;
    private  String LastName;
    private String SNN;
    private LocalDate DOB;
    private String Address;
    private char gender;
    private String PNumber;

    public Employee(int id, String firstName, String lastName, String SNN, LocalDate DOB, String address, char gender, String pNumber) {
        this.EmployeeID = id;
        this.FirstName = firstName;
        this.LastName = lastName;
        this.SNN = SNN;
        this.DOB = DOB;
        this.Address = address;
        this.gender = gender;
        this.PNumber = pNumber;
    }
    public int getEmployeeID() {
        return EmployeeID;
    }
        public Employee(int employeeId, String firstName, String lastName) {
            this.EmployeeID = employeeId;
            this.FirstName = firstName;
            this.LastName = lastName;
        }
    public String getFullName() {

            return FirstName + " " + LastName;
    }
    public String getFirstName() {
        return FirstName;
    }
    public String getLastName() {
        return LastName;
    }
    public String getSNN() {
        return SNN;
    }
    public LocalDate getDOB() {
        return DOB;
    }
    public String getAddress() {
        return Address;
    }
    public char getGender() {
        return gender;
    }

        public String getPNumber() {
            return PNumber;
        }

        public void setPNumber(String PNumber) {
            this.PNumber = PNumber;
        }
        public void setGender(char Gender) {
        this.gender = Gender;
        }
    public  void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }
    public void setAddress(String Address) {
        this.Address = Address;
    }
    public void setSNN(String SNN) {
        this.SNN = SNN;
    }
    @Override
        public String toString() {
            return "Employee ID: " + EmployeeID
                    + ", Employee Name: " + getFullName()
                    + ", SSN: " + SNN
                    + ", DOB: " + DOB
                    + ", Address: " + Address
                    + ", Gender: " + gender
                    + ", Phone Number: " + PNumber;
        }
    }

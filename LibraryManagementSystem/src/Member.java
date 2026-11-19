import java.time.LocalDate;

public class Member {
    private  int MemberID;
    private  String FirstName;
    private  String LastName;
    private String SNN;
    private LocalDate DOB;
    private String Address;
    private char gender;
    private String PNumber;


  public  Member(int id, String firstName, String lastName, String SNN, LocalDate DOB, String address, char gender, String pNumber){
      this.MemberID = id;
      this.FirstName = firstName;
      this.LastName = lastName;
      this.SNN = SNN;
      this.DOB = DOB;
      this.Address = address;
      this.gender = gender;
      this.PNumber = pNumber;
  }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }
  public String getFullName() {
  return FirstName + " " + LastName;
  }
    public String getSNN() {
        return SNN;
    }

    public void setSNN(String SNN) {
        this.SNN = SNN;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getPNumber() {
        return PNumber;
    }

    public void setPNumber(String PNumber) {
        this.PNumber = PNumber;
    }

    public int getMemberID() {
        return MemberID;
    }
    @Override
    public String toString() {
        return "Member ID: " + MemberID
                + ", Member Name: " + getFullName()
                + ", SSN: " + SNN
                + ", DOB: " + DOB
                + ", Address: " + Address
                + ", Gender: " + gender
                + ", Phone Number: " + PNumber;
    }
    }


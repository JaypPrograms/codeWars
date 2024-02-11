public class Student {

    private final String firstName;
    private final String lastName;
    public final String studentNumber;

    public Student(String firstName, String lastname, String studentNumber){
        this.firstName=firstName;
        this.lastName=lastname;
        this.studentNumber=studentNumber;
    }

    public String getFullName() {
      return firstName + " " + lastName;
    }
    public String getCommaName() {
      return lastName + ", " + firstName;
    }
  }
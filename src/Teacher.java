import java.util.Comparator;

public class Teacher implements Comparable<Teacher> {
    private String firstName;
    private String lastName;
    private String positionWork;
    private String numberPhone;

    public Teacher(String firstName, String lastName,
                   String positionWork, String numberPhone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.positionWork = positionWork;
        this.numberPhone = numberPhone;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPositionWork() {
        return positionWork;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    @Override
    public int compareTo(Teacher otherTeacher) {
        return this.lastName.compareTo(otherTeacher.getLastName());
    }
}

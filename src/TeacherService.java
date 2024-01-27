import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TeacherService {
    private List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void removeTeacher(Teacher teacher) {
        teachers.remove(teacher);
    }

    public void sortLastName(List<Teacher> teachers) {
        Collections.sort(teachers);
    }

    public void sortFirstName(List<Teacher> teachers) {
        Collections.sort(teachers, firstNameComparable);
    }

    Comparator<Teacher> firstNameComparable = new Comparator<Teacher>() {
        @Override
        public int compare(Teacher o1, Teacher o2) {
            return o1.getFirstName().compareTo(o2.getFirstName());
        }
    };

}

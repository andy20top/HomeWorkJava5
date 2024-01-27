import java.util.List;
import java.util.Scanner;

public class TeacherView {
    private Scanner scanner;

    public TeacherView() {
        this.scanner = new Scanner(System.in);
    }

    public void displayTeachers(List<Teacher> teachers) {
        System.out.println("Список учителей:\n");
        for (int i = 0; i < teachers.size(); i++) {
            Teacher teacher = teachers.get(i);
            System.out.println((i+1) + ": " + teacher.getLastName() + " " + teacher.getFirstName() +
                    ", " + "position work - " + teacher.getPositionWork() + "; phone - " +
                    teacher.getNumberPhone() + "\n");
        }
    }

    public int getChoice(String prompt) {
        System.out.println(prompt);
        return scanner.nextInt();
    }

    public String getUserInput(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public void showMenu() {
        System.out.println("Выберите, что хотите сделать:");
        System.out.println("1. Добавить учителя");
        System.out.println("2. Просмотреть список учителей");
        System.out.println("3. Отсортировать по имени");
        System.out.println("4. Отсортировать по фамилии");
        System.out.println("5. Удалить из списка");
        System.out.println("0. Чтобы выйти");
    }
}

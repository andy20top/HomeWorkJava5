public class TeacherController {
    private TeacherService model;
    private TeacherView view;

    public TeacherController(TeacherService model, TeacherView view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        int choice;

        do {
            view.showMenu();
            choice = view.getChoice("Выберите действие: ");

            switch (choice) {
                case 1:
                    view.getUserInput("");
                    String lastName = view.getUserInput("Введите фамилию: ");
                    String firstName = view.getUserInput("Введите имя: ");
                    String positionWork = view.getUserInput("Введите должность: ");
                    String phone = view.getUserInput("Введите телефон: ");
                    Teacher teacher = new Teacher(firstName, lastName, positionWork, phone);
                    model.addTeacher(teacher);
                    break;
                case 2:
                    view.displayTeachers(model.getTeachers());
                    break;
                case 3:
                    model.sortFirstName(model.getTeachers());
                    break;
                case 4:
                    model.sortLastName(model.getTeachers());
                    break;
                case 5:
                    int teacherNum = view.getChoice("Введите номер учителя в списке для удаления: ") - 1;
                    if (teacherNum >= 0 && teacherNum < model.getTeachers().size()) {
                        model.removeTeacher(model.getTeachers().get(teacherNum));
                    }
                    break;

            }
        } while (choice != 0);
    }
}

package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher t = new Teacher("Мария", "математика");
        t.evaluate(new Student("Илья"));
    }

    static class Teacher {
        private final String name;
        private final String subject;

        public Teacher(String name, String subject) {
            this.name = name;
            this.subject = subject;
        }

        public void evaluate(Student student) {
            String grade = null;
            int number = (int) (2 + Math.random() * 5);
            if (number == 2) {
                grade = "неудовлетворительно";
            } else if (number == 3) {
                grade = "удовлетворительно";
            } else if (number == 4) {
                grade = "хорошо";
            } else if (number == 5) {
                grade = "отлично";
            }
            System.out.println("Преподаватель " + name + " оценил студента с именем " + student.name + " по предмету " + subject + " на оценку " + grade);
        }
    }

    static class Student {
        private final String name;

        public Student(String name) {
            this.name = name;
        }
    }
}

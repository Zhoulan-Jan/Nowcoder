import java.util.ArrayList;
import java.util.Scanner;

public class $2 {
    static class Student{
        String name;
        int score;

        public Student(String name, int score) {
            this.name = name;
            this.score = score;
        }

//        @Override
//        public int compareTo(Student o) {
//            return score - o.score;
//        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int method = sc.nextInt();

            ArrayList<Student> students = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                String name = sc.next();
                int score = sc.nextInt();
                Student student = new Student(name, score);
                students.add(student);
            }

            if (method == 0) { //降序
                students.sort((o1, o2) -> o2.score - o1.score);
            } else { //升序
                students.sort((o1, o2) -> o1.score - o2.score);
            }

            for (Student student : students) {
                System.out.println(student.name + " " + student.score);
            }
        }
    }
}

package ideaGenerated;

import java.util.List;

import static ideaGenerated.StudentGenerator.generateStudentList;

public class Test {

    public static void main(String[] args) {
        int similar = 0;
        final List<Student> students = generateStudentList(1000);
        final int size = students.size();
        final long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                if (students.get(i).equals(students.get(j))) {
                    similar++;
                }
            }
        }
        final long finish = System.currentTimeMillis();
        System.out.println(similar);
        System.out.println("Time: " + (finish - start));
    }

}

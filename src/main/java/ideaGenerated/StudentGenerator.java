package ideaGenerated;

import java.util.LinkedList;
import java.util.List;

public class StudentGenerator {
    private static final String[] cities = {"New York", "Los Angeles", "Chicago", "Houston", "Phoenix"};
    private static final String[] names = {"James", "Mary", "John", "Patricia", "Robert"};
    private static final String[] lastName = {"Smith", "Johnson", "Williams", "Brown", "Jones"};
    private static final String[] university = {"Liberty University", "California State University, Fullerton",
            "Texas A&M University — College Station", "University of Central Florida",
            "The Ohio State University — Columbus"};

    public static List<Student> generateStudentList(int size) {
        final List<Student> students = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            students.add(generateStudent());
        }
        return students;
    }

    public static Student generateStudent() {
        final Student student = new Student();
        student.setCity(cities[generateInt(0, 4)]);
        student.setClassNumber(generateInt(1, 5));
        student.setFullName(generateFullName());
        student.setUniversity(university[generateInt(0, 4)]);

        return student;
    }

    private static String generateFullName() {
        return names[generateInt(0, 4)] + lastName[generateInt(0, 4)];
    }

    private static int generateInt(int from, int to) {
        return from + (int) (Math.random() * to);
    }
}

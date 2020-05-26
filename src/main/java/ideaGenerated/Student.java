package ideaGenerated;

public class Student {
    private String city;
    private String university;
    private String fullName;
    private int classNumber;

    public Student() {
    }

    public Student(String city, String university, String fullName, int classNumber) {
        this.city = city;
        this.university = university;
        this.fullName = fullName;
        this.classNumber = classNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }
    //437 millis ---- 1000 E
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Student student = (Student) o;
//
//        if (classNumber != student.classNumber) return false;
//        if (city != null ? !city.equals(student.city) : student.city != null) return false;
//        if (university != null ? !university.equals(student.university) : student.university != null) return false;
//        return fullName != null ? fullName.equals(student.fullName) : student.fullName == null;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;
        if (fullName != null ? fullName.equals(student.fullName) : student.fullName == null) return false;
        if (classNumber != student.classNumber) return false;
        if (city != null ? !city.equals(student.city) : student.city != null) return false;
        return university != null ? university.equals(student.university) : student.university == null;
    }

    @Override
    public int hashCode() {
        int result = city != null ? city.hashCode() : 0;
        result = 31 * result + (university != null ? university.hashCode() : 0);
        result = 31 * result + (fullName != null ? fullName.hashCode() : 0);
        result = 31 * result + classNumber;
        return result;
    }
}

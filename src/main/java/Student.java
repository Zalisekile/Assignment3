

public class Student
{
    public Student(String name,int studentNumber)
    {
        this.name = name;
        this.studentNumber = studentNumber;
    }

    int studentNumber;
    String name;

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return this.studentNumber == student.studentNumber && this.name.equals(name);
    }


}

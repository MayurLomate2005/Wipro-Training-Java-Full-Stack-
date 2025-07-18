package StudentGradingSystem.package1;


public class Student {
    String name;
    int[] marks;
    String grades;

    public Student(String name, int[] marks, String grades) {
        this.name = name;
        this.marks = marks;
        this.grades = grades;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getgrade() {
        return grades;
    }

    public void setgrade(String grades) {
        this.grades = grades;
    }

    public int[] getmarks() {
        return marks;
    }

    public void setmarks(int[] marks) {
        this.marks = marks;
    }

    public static void main(String[] args) {
       
    }
}

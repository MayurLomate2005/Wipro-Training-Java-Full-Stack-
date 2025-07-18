package StudentGradingSystem.package3;

import StudentGradingSystem.package1.Student;
import StudentGradingSystem.package2.NullMarksArrayException;
import StudentGradingSystem.package2.NullNameException;
import StudentGradingSystem.package2.NullStudentObjectException;

public class StudentReport {

    public String findgrades(Student studentobj) {
        int sum = 0;
        int[] marks = studentobj.getmarks();

        for (int mark : marks) {
            if (mark < 35) return "F";
            sum += mark;
        }

        if (sum < 150) return "C";
        else if (sum < 250) return "B";
        else return "A";
    }

    public String Validate(Student s) throws Exception {
        if (s == null) {
            throw new NullStudentObjectException();
        } else if (s.getname() == null) {
            throw new NullNameException();
        } else if (s.getmarks() == null) {
            throw new NullMarksArrayException();
        }
        return "VALID";
    }

    public int findNumberofNullMarksArray(Student s[]){
        int Count = 0;

        if(s!= null){
            for(int i = 0 ; i < s.length -1 ; i++){
                if(s[i] != null && s[i].getmarks() == null){
                    Count++;
                }
            }
        }
        return Count ;
    }
}

package main;

import java.util.ArrayList;
import java.util.Locale;

public class Transcript {

    private int studentID;

    private ArrayList<CourseGrade> courseGradesList;

    private double GPA;

    // GPA ve courseGradesList initialize edildi.
    public Transcript(int studentID) {
        this.studentID = studentID;
        this.GPA = 0;
        this.courseGradesList = new ArrayList<>();
    }

    // addCourseTaken metodu ile CourseGrade objesinin null olup olmadığı kontrol edildi.
    // Null olmadığı durumda courseGrade listesine eklendi ve GPA hesaplaması yapıldı.
    // Null olduğu durumda hata mesajı verildi.
    public void addCourseTaken(CourseGrade courseGrade) {

        if(courseGrade != null) {
            this.courseGradesList.add(courseGrade);
            double gradeTotal = 0;
            for (CourseGrade courseGrade1 : this.courseGradesList) {
                gradeTotal += (double) courseGrade1.getGradeTaken().getNumericValue() / (double) this.courseGradesList.size();
            }
            this.GPA = gradeTotal;
        } else {
            System.out.println("CourseGrade cannot be null!");
        }
    }

    @Override
    public String toString() {
        return "Student ID: " + this.studentID + "\n" + this.courseGradesList.toString()
                .replaceAll("\\[", "")
                .replaceAll(", ", "")
                .replaceAll("]", "")
                + "GPA: " + String.format(Locale.US, "%.2f", this.GPA);
    }
}

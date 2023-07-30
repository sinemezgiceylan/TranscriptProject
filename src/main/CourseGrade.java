package main;

import util.Grade;

public class CourseGrade {

    private String courseDepartment;

    private int courseCode;

    private int courseCredit;

    private Grade gradeTaken;

    // İlk üç constructor, sınıfın parametrelerine sahip dördüncü constructor'ı çağırıldı
    // ve varsayılan değerlerle dolduruldu.
    public CourseGrade(String courseDepartment) {
        this(courseDepartment, 100, 4, Grade.F);
    }

    public CourseGrade(String courseDepartment, int courseCode) {
        this(courseDepartment, courseCode, 4, Grade.F);
    }

    public CourseGrade(String courseDepartment, int courseCode, int courseCredit) {
        this(courseDepartment, courseCode, courseCredit, Grade.F);
    }

    // Set metodu ile alanlar ayarlandı.
    public CourseGrade(String courseDepartment, int courseCode, int courseCredit, Grade gradeTaken) {
        setCourseDepartment(courseDepartment);
        setCourseCode(courseCode);
        setCourseCredit(courseCredit);
        setGradeTaken(gradeTaken);
    }

    public CourseGrade(String courseDepartment, int courseCode, int courseCredit, double gradeTaken) {
        setCourseDepartment(courseDepartment);
        setCourseCode(courseCode);
        setCourseCredit(courseCredit);
        setGradeTaken(gradeTaken);
    }

    public String getCourseDepartment() {
        return courseDepartment;
    }

    // CourseDepartment için koşullar incelendi ve aksi durum için varsayılan değer atandı.
    public void setCourseDepartment(String courseDepartment) {
        if (courseDepartment.equalsIgnoreCase("CENG") || courseDepartment.equalsIgnoreCase("COMP")
                || courseDepartment.equalsIgnoreCase("ECE") || courseDepartment.equalsIgnoreCase("ME")
                || courseDepartment.equalsIgnoreCase("MATH")) {
            this.courseDepartment = courseDepartment;
        } else {
            this.courseDepartment = "CENG";
        }
    }

    public int getCourseCode() {
        return courseCode;
    }

    // CourseCode için koşullar değerlendirildi ve aksi durum için varsayılan değer atandı.
    public void setCourseCode(int courseCode) {
        if (courseCode > 100 && courseCode < 599) {
            this.courseCode = courseCode;
        } else {
            this.courseCode = 100;
        }

    }

    public int getCourseCredit() {
        return courseCredit;
    }

    // CourseCredit için koşullar değerlendirildi ve aksi durum için varsayılan değer atandı.
    public void setCourseCredit(int courseCredit) {
        if (courseCredit == 3) {
            this.courseCredit = courseCredit;
        } else {
            this.courseCredit = 4;
        }

    }

    public Grade getGradeTaken() {
        return gradeTaken;
    }

    public void setGradeTaken(Grade g) {
        this.gradeTaken = g;
    }

    // Overloaded metot tanımlandı.
    public void setGradeTaken(double val) {
        if (val >= 0 && val <= 4) {
            int gradeRounded = (int) Math.round(val);
            for (Grade grade : Grade.values()) {
                if (grade.getNumericValue() == gradeRounded) {
                    this.gradeTaken = grade;
                }
            }
        } else {
            this.gradeTaken = Grade.F;
        }
    }

    @Override
    public String toString() {
        return "Department: " + this.courseDepartment
                + " CourseCode: " + this.courseCode
                + " Credit: " + this.courseCredit
                + " Grade: " + this.gradeTaken.getStringValue() + "\n";
    }
}

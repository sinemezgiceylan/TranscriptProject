import main.CourseGrade;
import main.Transcript;
import util.Grade;


public class main {

    public static void main(String[] args) {

        CourseGrade course1 = new CourseGrade("CENG", 201, 4, Grade.D);
        CourseGrade course2 = new CourseGrade("MATH", 601, 4, Grade.A); // Varsayılan courseCode atanır.
        CourseGrade course3 = new CourseGrade("ME", 201, 5, Grade.C);
        CourseGrade course4 = new CourseGrade("ECE", 201, 3, Grade.F);
        CourseGrade course5 = new CourseGrade("CENG", 101, 4, Grade.B);

        Transcript transcript = new Transcript(1112234);
        transcript.addCourseTaken(course1);
        transcript.addCourseTaken(course2);
        transcript.addCourseTaken(course3);
        transcript.addCourseTaken(course4);
        transcript.addCourseTaken(course5);

        System.out.print(transcript);
    }
}

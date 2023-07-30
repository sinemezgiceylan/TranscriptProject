import main.CourseGrade;
import main.Transcript;
import util.Grade;
import main.GenerateTranscript;



public class main {

    public static void main(String[] args) {

        GenerateTranscript generateTranscript = new GenerateTranscript();
        generateTranscript.takeInputFromUser();
        generateTranscript.takeInputFromFile();
    }
}

package main;
import java.io.*;
import java.io.File;
import java.util.Scanner;

public class GenerateTranscript {

    Scanner input = new Scanner(System.in);

    public void takeInputFromUser() {

        System.out.println("Enter Student Id: ");
        int studentId = Integer.parseInt(input.nextLine());
        Transcript transcript = new Transcript(studentId);

        while (true) {

            System.out.println("Enter Department: ");
            String courseDepartment = input.nextLine();

            System.out.println("Enter Course Code: ");
            int courseCode = Integer.parseInt(input.nextLine());

            System.out.println("Enter Credit: ");
            int courseCredit = Integer.parseInt(input.nextLine());

            System.out.println("Enter Grade: ");
            double gradeTaken = Double.parseDouble(input.nextLine());

            CourseGrade courseGrade = new CourseGrade(courseDepartment, courseCode, courseCredit, gradeTaken);
            transcript.addCourseTaken(courseGrade);

            System.out.println("1: Continue - 2: Save and Exit");
            int select = Integer.parseInt(input.nextLine());

             if (select == 2) {
                System.out.println(transcript);
                break;
            } else if( select != 1 && select != 2) {
                 System.out.println("Incorrect entry");
                 break;
             }


        }

    }

    public void takeInputFromFile(){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter filename: ");
        String fileName = "C:\\Users\\ceyla\\Desktop\\Java-Ders-Projeleri\\TranscriptProject\\src\\" + input.nextLine();



        try {
            File file = new File(fileName);
            input = new Scanner(file);

            int studentId = Integer.parseInt(input.nextLine());
            Transcript transcript = new Transcript(studentId);

            while (input.hasNextLine()) {
                String row = input.nextLine();
                String[] fileRow = row.split(" ");

                String courseDepartment = fileRow[0];
                int courseCode = Integer.parseInt(fileRow[1]);
                int courseCredit = Integer.parseInt(fileRow[2]);
                double gradeTaken = Double.parseDouble(fileRow[3]);

                CourseGrade courseGrade = new CourseGrade(courseDepartment, courseCode, courseCredit, gradeTaken);
                transcript.addCourseTaken(courseGrade);
            }

            System.out.println(transcript);


        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }

}

import java.util.Scanner;
import CIE.Internals;
import CIE.Quiz;
import SEE.Externals;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        n = sc.nextInt();
        Internals[] cie = new Internals[n];
        Externals[] see = new Externals[n];
        Quiz[] quiz = new Quiz[n];

        for(int i = 0;i<see.length;i++){
            System.out.println("Enter Details of Student " + (i+1) + ": ");
            see[i] = new Externals();
            see[i].setDetails();
            System.out.println("Enter Internal Marks of Student " + (i+1) + ": ");
            cie[i] = new Internals();
            cie[i].setMarks();
            System.out.println("Enter Quiz Marks of Student " + (i+1) + ": ");
            quiz[i] = new Quiz();
            quiz[i].setMarks();
            System.out.println("Enter External Marks of Student " + (i+1) + ": ");
            see[i].setMarks();
        }

        for(int i = 0;i<see.length;i++){
            System.out.println("Details of Student " + (i+1) + ": ");
            see[i].getDetails();
            System.out.println("Internal Marks of Student " + (i+1) + ": ");
            cie[i].getMarks(quiz[i].quizMarks);
            System.out.println("External Marks of Student " + (i+1) + ": ");
            see[i].getMarks();
            System.out.println("Final Marks out of 100 of Student " + (i+1) + ": ");
            for(int j = 0;j<5;j++){
                System.out.println("    Subject " + (j+1) + " >> " + (cie[i].getMarksByIndex(j) + see[i].getMarksByIndex(j) + quiz[i].getMarksByIndex(j)));
            }
            System.out.println("-------------------------------");
        }


        sc.close();
    }
}
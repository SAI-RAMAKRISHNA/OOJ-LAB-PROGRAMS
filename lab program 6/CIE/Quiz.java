package CIE;

import java.util.Scanner;

public class Quiz {
    public double quizMarks[] = new double[5];
    Scanner sc = new Scanner(System.in);

    public void setMarks(){
        System.out.println("Enter Quiz Marks of Subjects (out of 10)");
        for(int i = 0;i<quizMarks.length;i++){
            quizMarks[i] = sc.nextDouble();
        }
    }

    public double getMarksByIndex(int index){
        return quizMarks[index];
    }
}
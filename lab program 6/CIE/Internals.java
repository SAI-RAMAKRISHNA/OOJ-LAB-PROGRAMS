package CIE;
import java.util.Scanner;

public class Internals extends Student {
    double internalMarks[] = new double[5];
    Scanner sc = new Scanner(System.in);

    public void setMarks(){
        for(int i = 0;i<internalMarks.length;i++){
            System.out.println("Enter Internal Marks(40) of Subject " + (i+1) + ": ");
            internalMarks[i] = sc.nextDouble();
        }
    }

    public void getMarks(double quizMarks[]){
        System.out.println("Internals Marks out of 50: ");
        for(int i=0;i<internalMarks.length;i++){
            System.out.println("    Subject " + (i+1) +"  >> " + (internalMarks[i] + quizMarks[i]));
        }
    }

    public double getMarksByIndex(int index){
        return internalMarks[index];
    }
}
package SEE;
import CIE.Student;

import java.util.Scanner;

public class Externals extends Student {
    double[] externalMarks = new double[5];
    Scanner sc = new Scanner(System.in);

    public void setDetails(){
        System.out.println("Enter name: ");
        name = sc.nextLine();
        System.out.println("Enter USN: ");
        usn = sc.nextLine();
        System.out.println("Enter Sem");
        sem = sc.nextInt();
    }

    public void setMarks(){
        for(int i = 0;i<externalMarks.length;i++){
            System.out.println("Enter External Marks(100) of Subject " + (i+1) + ": ");
            externalMarks[i] = sc.nextDouble()/2;
        }
    }


    public void getDetails(){
        System.out.println("Name: " + name + "\nUSN: " + usn + "\nSemester: " + sem);
    }

    public void getMarks(){
        System.out.println("External Marks out of 50: ");
        for(int i=0;i<externalMarks.length;i++){
            System.out.println("    Subject " + (i+1) +"  >> " + externalMarks[i]);
        }
    }

    public double getMarksByIndex(int index){
        return externalMarks[index];
    }
}

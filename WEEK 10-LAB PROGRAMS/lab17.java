import java.util.Scanner;

class WrongAge extends Exception {
    public WrongAge(String s){
        super(s);
    }
}


class Father {
    int fatherAge;

    Father(int fAge, int sAge) throws WrongAge{
        if(fAge <= sAge){
            throw new WrongAge("Father's Age is equal to or less than Son's Age");
        }else{
            this.fatherAge = fAge;
        }
    }
}
class Son extends Father {
    int sonAge;

    Son(int fAge, int sAge) throws WrongAge{
        super(fAge, sAge);
        this.sonAge = sAge;
    }

    void print(){
        System.out.println("Father\'s Age: " + fatherAge);
        System.out.println("Son\'s Age: " + sonAge);
    }
}

public class lab17{
    public static void main(String[] args){
        int fAge,sAge;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Father\'s age");
        fAge = sc.nextInt();
        System.out.println("Enter Sons\'s age");
        sAge = sc.nextInt();
        
        try{
            Son son = new Son(fAge, sAge);
            son.print();
        }catch(WrongAge err){
            System.out.println("Exception " + err);
        }

    }    
}
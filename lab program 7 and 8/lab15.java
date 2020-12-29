class myname<A,B>
{
    A obj1;
    B obj2;
    myname(A obj1, B obj2){
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public void print(){
        System.out.println(this.obj1);
        System.out.println(this.obj2);
    }
}

public class lab15{
    public static void main(String[] args) {
        myname<String,Integer> myObj = new myname<String, Integer>("age", 40);
        myname<String,Double> myObj2 = new myname<String, Double>("WEIGHT",60.00);
        myObj.print();
        myObj2.print();
    }
}
class One implements Runnable{
    Thread t1;
    String message;
    long time;
    One(String message, long time){
        this.message = message;
        this.time = time;
        t1 = new Thread(this,"Thread");
        System.out.println("One starts " + t1);
        t1.start();
    }

    public void run(){
        try{
            for(int i = 5; i>0; i--){
                System.out.println(message);
                t1.sleep(this.time);
            }
        }catch(InterruptedException ie){
            System.out.println("One Interrupted");
        }
        System.out.println("One Done");
    }
}


public class thpro{
    public static void main(String[] args) {
        One o = new One("BMS College Of Engineering",10000);
        One t = new One("CSE",2000);
    }
}
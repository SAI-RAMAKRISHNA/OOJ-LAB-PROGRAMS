import java.awt.*;
import java.awt.event.*;


public class Prog1 extends Frame implements ActionListener{
    TextField Num1, Num2;
    Button divide = new Button("Divide");
    float res = 0;
    String error = "";
    public Prog1(){
        setLayout(new FlowLayout());
        Num1 = new TextField(1);
        Num2 = new TextField(1);
        Label Num1L = new Label("Num1: ", Label.RIGHT);
        Label Num2L = new Label("Num2: ", Label.RIGHT);
        add(Num1L);
        add(Num1);
        add(Num2L);
        add(Num2);
        add(divide);
        divide.addActionListener(this);
        addWindowListener(new WinAdapter());
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == divide){
            try{
                int n1 = Integer.parseInt(Num1.getText());
                int n2 = Integer.parseInt(Num2.getText());
                if(n2 <= 0)
                    throw new ArithmeticException("Error");
                res = (float)n1/n2;
            }catch(NumberFormatException exception){
                res = 0;
                error = "Entered number is not an integer.";
            }catch(ArithmeticException exception){
                res = 0;
                error = "You tried to divide by zero.";
            }
            repaint();
        }
    }

    public void paint(Graphics g){
        g.drawString("Result: " + String.valueOf(res), 20, 100);
        g.drawString("Error: " + error, 20, 150);
    }

    public static void main(String[] args) {
        Prog1 p = new Prog1();
        p.setSize(new Dimension(400,250));
        p.setTitle("Divide");
        p.setVisible(true);
    }
}

class WinAdapter extends WindowAdapter{
    public void windowClosing(WindowEvent we){
        System.exit(0);
    }
}
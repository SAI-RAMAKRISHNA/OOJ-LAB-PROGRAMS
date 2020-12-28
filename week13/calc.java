import java.awt.*;
import java.awt.event.*;


public class Calc extends Frame implements ActionListener{
    TextField Num1, Num2, Operator, Result;
    Button calc = new Button("Calculate");
    float  res = 0;
    String error = "";
    public Calc(){
        setLayout(new FlowLayout());
        Num1 = new TextField(1);
        Num2 = new TextField(1);
        Operator = new TextField(1);
        Result = new TextField(1);
        Label Num1L = new Label("Num1: ");
        Label Num2L = new Label("Num2: ");
        Label Op = new Label("Op: ");
        Label Res = new Label("Result: ");
        add(Num1L);
        add(Num1);
        add(Op);
        add(Operator);
        add(Num2L);
        add(Num2);
        add(calc);
        add(Res);
        add(Result);
        calc.addActionListener(this);
        addWindowListener(new WinAdapter());
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == calc){
            try{
                int n1 = Integer.parseInt(Num1.getText());
                int n2 = Integer.parseInt(Num2.getText());
                String op = Operator.getText();
                if(op.isEmpty()){
                    throw new Exception("Error");
                }
                if(n2 <= 0)
                    throw new ArithmeticException("Error");
                switch(op){
                    case "+": {
                        res = n1 + n2;
                        Result.setText(String.valueOf(res));
                        Num1.setText("");
                        Num2.setText("");
                        break;
                    }
                    case "-": {
                        res = n1 - n2;
                        Result.setText(String.valueOf(res));
                        Num1.setText("");
                        Num2.setText("");
                        break;
                    }
                    case "*": {
                        res = n1 * n2;
                        Result.setText(String.valueOf(res));
                        Num1.setText("");
                        Num2.setText("");
                        break;
                    }
                    case "/": {
                        res = (float)n1/n2;
                        Result.setText(String.valueOf(res));
                        Num1.setText("");
                        Num2.setText("");
                        break;
                    }
                    default: {
                        Num1.setText("");
                        Num2.setText("");
                    }
                }    

            }catch(NumberFormatException exception){
                res = 0;
                error = "Entered number is not an integer.";
            }catch(ArithmeticException exception){
                res = 0;
                error = "You tried to divide by zero.";
            }catch(Exception e){
                res = 0;
                error = "Operator field is empty";
            }
            repaint();
        }
    }

    public void paint(Graphics g){
        g.drawString("Error: " + error, 20, 150);
    }

    public static void main(String[] args) {
        Calc p = new Calc();
        p.setSize(new Dimension(600,600));
        p.setTitle("Calc");
        p.setVisible(true);
    }
}

class WinAdapter extends WindowAdapter{
    public void windowClosing(WindowEvent we){
        System.exit(0);
    }
}
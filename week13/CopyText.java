import java.awt.*;
import java.awt.event.*;

public class CopyText extends Frame implements ActionListener{
    TextField Field1, Field2;
    Button Paste = new Button("Paste");
    String error = "";
    public CopyText(){
        setLayout(new FlowLayout());
        Field1 = new TextField(20);
        Field2 = new TextField(20);
        Label Field1L = new Label("Field 1: ");
        Label Field2L = new Label("Field 2: ");
        this.setBackground(Color.black);
        Field1L.setForeground(Color.green);
        Field2L.setForeground(Color.green);
        Field1.setForeground(Color.green);
        Field2.setForeground(Color.green);
        Field1.setBackground(Color.black);
        Field2.setBackground(Color.black);
        add(Field1L);
        add(Field1);
        add(Field2L);
        add(Field2);
        add(Paste);
        Paste.addActionListener(this);
        addWindowListener(new WinAdapter());
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == Paste){
            String f1 = Field1.getText();
            String f2 = Field2.getText();
            try{
                if(f1.isBlank()){
                    error = "Field 1 is empty";
                    throw new Exception("Error");
                }
                Field2.setText(Field1.getText());
            }catch(Exception e){
                System.out.println(e);
                repaint();
            }
        }
    }

    public void paint(Graphics g){
        g.setColor(Color.green);
        g.drawString("Error: " + error, 10, 100);
    }

    public static void main(String[] args) {
        CopyText p = new CopyText();
        p.setSize(new Dimension(400,250));
        p.setTitle("Copy-Paste");
        p.setVisible(true);
    }
}

class WinAdapter extends WindowAdapter{
    public void windowClosing(WindowEvent we){
        System.exit(0);
    }
}
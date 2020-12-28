import java.awt.*;
import java.awt.event.*;

public class TextFieldDemo extends Frame implements ActionListener{
    TextField name, pass;
    public TextFieldDemo(){
        setLayout(new FlowLayout());
        Label nameL = new Label("Name: ", Label.RIGHT);
        Label passL = new Label("Password: ", Label.RIGHT);
        name = new TextField(12);
        pass = new TextField(8);
        pass.setEchoChar('*');
        add(nameL);
        add(name);
        add(passL);
        add(pass);
        name.addActionListener(this);
        pass.addActionListener(this);
        addWindowListener(new MyWindowAdapter());
    }

    public void actionPerformed(ActionEvent ae){
        repaint();
    }

    public void paint(Graphics g){
        g.drawString("Name: " + name.getText(), 6, 60);
        g.drawString("Selcted text in name: " + name.getSelectedText(), 6, 80);
        g.drawString("Pass: " + pass.getText(), 6, 100);
    }

    public static void main(String[] args) {
        TextFieldDemo t = new TextFieldDemo();
        t.setSize(new Dimension(600,250));
        t.setTitle("textbox demo");
        t.setVisible(true);
    }
}


class MyWindowAdapter extends WindowAdapter{
    public void windowClosing(WindowEvent we){
        System.exit(0);
    }
}
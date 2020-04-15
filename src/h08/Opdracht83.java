package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht83 extends Applet {
    Button knop;
    TextField textvenster;
    Label label;
    double getal,btw1,btw2;
    String uitkomst;

    public void init() {
        knop = new Button();
        knop.setLabel( "OK" );
        textvenster = new TextField("", 20);
        label = new Label("Bedrag");
        knop.addActionListener( new KnopListener() );
        add(label);
        add(textvenster);
        add(knop);
        textvenster.addActionListener( new TextvensterListener() );
    }

    public void paint(Graphics g) {

    }
    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = textvenster.getText();
            getal = Double.parseDouble(s);
            btw1=getal*0.21;
            btw2=btw1+getal;
            uitkomst=String.valueOf(btw2);
            textvenster.setText(uitkomst);
            repaint();

        }
    }
    class TextvensterListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = textvenster.getText();
            getal = Double.parseDouble(s);
            btw1 = getal * 0.21;
            btw2 = btw1 + getal;
            uitkomst = String.valueOf(btw2);
            textvenster.setText(uitkomst);
            repaint();

        }
    }
}
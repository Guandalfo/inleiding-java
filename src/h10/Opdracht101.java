package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht101 extends Applet {
    TextField tekstvak;
    Button knop;
    double getal,hooggetal,laaggetal;
    Label label;
    String uitvoer,uitvoer2;


    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Typ een getal");
        add(label);
        add(tekstvak);
        knop = new Button();
        knop.setLabel("OK");
        add(knop);
        knop.addActionListener( new KnopListener() );
        uitvoer="";
        uitvoer2="";
    }


    public void paint(Graphics g) {
        g.drawString("Hoogste getal: "+uitvoer, 60, 60);
        g.drawString("Laagste getal: "+uitvoer2, 60, 80);

    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Double.parseDouble(s);
            if (getal>hooggetal){
                hooggetal=getal;
                uitvoer=(""+hooggetal);
                tekstvak.setText("");
            }
            else{
                uitvoer=(""+hooggetal);
                tekstvak.setText("");
            }
            if (getal < hooggetal) {
                laaggetal=getal;
                uitvoer2=(""+laaggetal);
                tekstvak.setText("");
            }
            repaint();
        }
    }
}

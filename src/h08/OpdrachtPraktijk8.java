package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class OpdrachtPraktijk8 extends Applet {
    Button  knop1,knop2,knop3,knop4;
    TextField  tekstvak1,tekstvak2;
    double  getal1,getal2,antwoord;
    String  uitkomst;


    public void init() {
        knop1= new Button();
        knop1.setLabel("*");
        knop2= new Button();
        knop2.setLabel("/");
        knop3= new Button();
        knop3.setLabel("+");
        knop4= new Button();
        knop4.setLabel("-");
        knop1.addActionListener( new Knop1Listener() );
        knop2.addActionListener( new Knop2Listener() );
        knop3.addActionListener( new Knop3Listener() );
        knop4.addActionListener( new Knop4Listener() );
        tekstvak1 = new TextField("", 20);
        tekstvak2 = new TextField("", 20);
        add(tekstvak1);
        add(tekstvak2);
        add(knop1);
        add(knop2);
        add(knop3);
        add(knop4);





    }

    public void paint(Graphics g) {

    }
    class Knop1Listener implements ActionListener {
        public void actionPerformed(ActionEvent Enter) {
            String s = tekstvak1.getText();
            getal1 = Double.parseDouble(s);
            String a = tekstvak2.getText();
            getal2 = Double.parseDouble(a);
            antwoord=getal1*getal2;
            uitkomst=String.valueOf(antwoord);
            tekstvak1.setText(uitkomst);
            tekstvak2.setText("");
            repaint();

        }
    }
    class Knop2Listener implements ActionListener {
        public void actionPerformed(ActionEvent Enter) {
            String s = tekstvak1.getText();
            getal1 = Double.parseDouble(s);
            String a = tekstvak2.getText();
            getal2 = Double.parseDouble(a);
            antwoord=getal1/getal2;
            uitkomst=String.valueOf(antwoord);
            tekstvak1.setText(uitkomst);
            tekstvak2.setText("");
            repaint();


        }
    }
    class Knop3Listener implements ActionListener {
        public void actionPerformed(ActionEvent Enter) {
            String s = tekstvak1.getText();
            getal1 = Double.parseDouble(s);
            String a = tekstvak2.getText();
            getal2 = Double.parseDouble(a);
            antwoord=getal1+getal2;
            uitkomst=String.valueOf(antwoord);
            tekstvak1.setText(uitkomst);
            tekstvak2.setText("");
            repaint();

        }
    }
    class Knop4Listener implements ActionListener {
        public void actionPerformed(ActionEvent Enter) {
            String s = tekstvak1.getText();
            getal1 = Double.parseDouble(s);
            String a = tekstvak2.getText();
            getal2 = Double.parseDouble(a);
            antwoord=getal1-getal2;
            uitkomst=String.valueOf(antwoord);
            tekstvak1.setText(uitkomst);
            tekstvak2.setText("");
            repaint();

        }
    }
}

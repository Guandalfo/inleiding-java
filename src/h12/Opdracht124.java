package h12;

import java.awt.*;
import java.applet.*;
import java.util.*;
import java.awt.event.*;


public class Opdracht124 extends Applet {
    Button knop;
    TextField tekstvak;
    int[] getallen = {1, 2, 3, 5, 7, 8, 13, 45, 67, 32, 11, 12, 13, 14, 15, 16, 45, 90, 100};
    int getal, teller;
    String tekst;

    public void init() {
        tekst = "";
        teller = 0;
        knop = new Button("OK");
        tekstvak = new TextField("", 10);
        add(tekstvak);
        add(knop);
        knop.addActionListener(new KnopListener());
    }

    public void paint(Graphics g) {
        g.drawString("" + tekst, 50, 50);


    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Integer.parseInt(s);
            tekstvak.setText("");
            teller=0;
            while (teller < getallen.length) {
                if (getal == getallen[teller]) {
                    tekst = ("Gevonden!  " + getal);
                    break;
                }
                else{
                    tekst="Niet gevonden..";
                }
                teller++;
                repaint();
            }
        }
    }
}
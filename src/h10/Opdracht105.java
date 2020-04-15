package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht105 extends Applet {
    Button knop;
    double cijfer, gemiddelde, cijfers;
    String uitkomst, gemiddeld, geslaagd;
    TextField tekstvak;
    Label label;
    int teller;


    public void init() {
        knop = new Button();
        knop.setLabel("OK");
        tekstvak = new TextField("", 10);
        label = new Label("Voer hier je 10 cijfers in en druk op ENTER: ");
        add(label);
        add(tekstvak);
        add(knop);
        uitkomst = "";
        gemiddeld = "";
        geslaagd = "";
        knop.addActionListener(new KnopListener());
        tekstvak.addActionListener(new Tekstvaklistener());
        teller = 0;
        cijfers = 0;

    }


    public void paint(Graphics g) {
        g.drawString("Voldoende/onvoldoende: " + uitkomst, 830, 60);
        g.drawString("Gemiddelde van de cijfers: " + gemiddeld, 830, 80);
        g.drawString("Eindresultaat: " + geslaagd, 830, 120);
        g.drawString("Aantal cijfers: " + teller, 830, 100);

    }

    class Tekstvaklistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            teller++;
            String s = tekstvak.getText();
            cijfer = Integer.parseInt(s);
            cijfers = +cijfer + cijfers;
            tekstvak.setText("");
            if (cijfer <= 5) {
                uitkomst = "Onvoldoende";
            } else {
                uitkomst = "Voldoende";
            }
            if (teller == 11) {
                teller = 10;

            }
            if (cijfer > 10) {
                teller = 0;
                tekstvak.setText("Te hoog");
                uitkomst = "";
            }
            if (teller == 10) {
                tekstvak.setText("Klik op OK");
            }

            repaint();
        }

    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            gemiddelde = cijfers / 10;
            if (teller==10 && gemiddelde <= 5.5) {
                geslaagd="Niet geslaagd";
                gemiddeld=(""+gemiddelde);
                uitkomst = "";
            }
            if (teller==10 && gemiddelde > 5.4) {
                geslaagd="Geslaagd!";
                gemiddeld=(""+gemiddelde);
                uitkomst = "";
            }
            if (teller == 0) {
                geslaagd="";
                gemiddeld="";
            }
            repaint();
        }
    }
}
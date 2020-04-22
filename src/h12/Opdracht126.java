package h12;

import java.awt.*;
import java.applet.*;
import java.util.*;
import java.awt.event.*;


public class Opdracht126 extends Applet {
    int[] getallen = {3, 3, 5, 1, 5, 6, 7, 3, 5, 6, 7, 8, 8, 9, 10, 10, 9, 2, 2, 4, 4, 4};
    TextField tekstvak;
    Button knop;
    int teller,getal;
    String tekst;

    public void init() {
        knop = new Button("OK");
        tekstvak = new TextField("", 10);
        add(tekstvak);
        add(knop);
        teller = 0;
        tekst = "";
        knop.addActionListener(new KnopListener());
    }

    public void paint(Graphics g) {
        g.drawString(""+tekst,50,50);

    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Integer.parseInt(s);
            tekstvak.setText("");
            teller=0;
            int teller2=0;
            while(teller<getallen.length){
                if(getal==getallen[teller]){
                    teller2++;
                    tekst="Het getal is gevonden. Het getal is:      "+getal+"      en het getal zit er       "+teller2+"    keer in.";
                    if(teller2>=getallen[teller]){
                        break;
                    }
                }
                else{
                    tekst="Het getal is niet gevonden. Het getal is:       "+getal+"        en het getal zit er       "+teller2+"    keer in.";
                }
                teller++;
            }
            repaint();

        }
    }
}

package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class OpdrachtPraktijk10 extends Applet {
    TextField tekstvak;
    Button knop;
    String tekst;
    int getal;



    public void init() {
        knop= new Button();
        knop.setLabel("OK");
        tekstvak= new TextField("",20);
        add(tekstvak);
        add(knop);
        knop.addActionListener( new KnopListener() );
        tekst="";
    }


    public void paint(Graphics g) {
        g.drawString("Status: "+tekst,855,50);


    }
    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Integer.parseInt(s);
            switch(getal){
                case 1:
                    tekst="slecht";
                    break;
                case 2:
                    tekst="slecht";
                    break;
                case 3:
                    tekst="slecht";
                    break;
                case 4:
                    tekst="onvoldoende";
                    break;
                case 5:
                    tekst="matig";
                case 6:
                    tekst="voldoende";
                    break;
                case 7:
                    tekst="voldoende";
                    break;
                case 8:
                    tekst="goed";
                    break;
                case 9:
                    tekst="goed";
                    break;
                case 10:
                    tekst="goed";
                    break;
                default:
                    tekst="verkeerd getal";
                    break;
            }
            repaint();
        }
    }
}

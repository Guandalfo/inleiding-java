package h11;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class OpdrachtPraktijk2 extends Applet {
    int getal, keergetal, antwoord,y;
    Button knop;

    public void init() {
        knop = new Button("OK");
        add(knop);
        knop.addActionListener(new KnopListener());
        antwoord=0;
        y=50;
    }

    public void paint(Graphics g) {
        for(keergetal=1;keergetal<11;keergetal++){
            if(getal==0){
                getal++;
            }
            else {
                y = y + 20;
                antwoord = getal * keergetal;
                g.drawString("" + getal + "  *  " + keergetal + "  =  " + antwoord, 50, y);
            }
        }
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            y=50;
            getal++;
            repaint();

        }
    }
}
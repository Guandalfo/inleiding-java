package h11;

import java.awt.*;
import java.applet.*;


public class Opdracht113 extends Applet {
    int getal1,getal2,y,getal3,teller;

    public void init() {
        y=30;
        getal1=1;
        getal2=1;
        teller=0;
    }

    public void paint(Graphics g) {
        g.drawString(""+getal1,50,y);
        y=y+20;
        g.drawString(""+getal2,50,y);
        y=y+20;
        for (teller=0; teller<5;teller++) {
            getal3=getal1+getal2;
            getal1=getal2+getal3;
            getal2=getal1+getal3;
            getal3=getal1+getal2;
            g.drawString(""+getal1,50,y);
            y=y+20;
            g.drawString(""+getal2,50,y);
            y=y+20;
            g.drawString(""+getal3,50,y);
            y=y+20;
        }
    }
}
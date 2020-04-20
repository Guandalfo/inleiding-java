package h11;

import java.awt.*;
import java.applet.*;


public class Opdracht114 extends Applet {
    int getal,antwoord,y;

    public void init() {
        y=50;
        antwoord=0;
    }

    public void paint(Graphics g) {
        for(getal=1;getal<11;getal++){
            antwoord=getal*3;
            y=y+20;
            g.drawString(""+getal+"  *  3  =  "+antwoord,50,y);
        }
    }
}
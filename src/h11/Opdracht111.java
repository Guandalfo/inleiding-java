package h11;

import java.awt.*;
import java.applet.*;


public class Opdracht111 extends Applet {
    int teller;
    int x;

    public void init() {
        teller=0;
    }

    public void paint(Graphics g) {
        for (teller=0; teller<10; teller++) {
            x=x+20;
            g.drawLine(x,30,x,250);
        }
    }
}
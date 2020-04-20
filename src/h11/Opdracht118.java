package h11;

import java.awt.*;
import java.applet.*;


public class Opdracht118 extends Applet {
    int h,w,teller;

    public void init() {
    }

    public void paint(Graphics g) {
        h=5;
        w=5;
        for(teller=0; teller<100;teller++){
            h=h+5;
            w=w+5;
            g.drawOval(100,100,w,h);
        }

    }
}
package h11;

import java.awt.*;
import java.applet.*;


public class Opdracht117 extends Applet {
    int x,y,height,width,teller;

    public void init() {
    }

    public void paint(Graphics g) {
        height=5;
        width=6;
        x=500;
        y=500;
        for(teller=0;teller<50;teller++){
            x=x-3;
            y=y-3;
            height=height+6;
            width=width+6;
            g.drawOval(x,y,width,height);
        }

    }
}

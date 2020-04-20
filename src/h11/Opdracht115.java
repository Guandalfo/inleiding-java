package h11;

import java.awt.*;
import java.applet.*;


public class Opdracht115 extends Applet {
    int x,y,teller;

    public void init() {
        x=50;
        y=50;
    }

    public void paint(Graphics g) {
        for(teller=0;teller<5;teller++){
            x=x+50;
            y=y+50;
            g.drawRect(x,y,50,50);
        }

    }
}

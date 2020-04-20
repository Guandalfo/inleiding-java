package h11;

import java.awt.*;
import java.applet.*;


public class Opdracht116 extends Applet {
    int height,width,x,y,teller;

    public void init() {
    }

    public void paint(Graphics g) {
        x=100;
        y=100;
        height=20;
        width=20;
        for(teller=0; teller<5; teller++){
            x=x-10;
            y=y-10;
            height=height+20;
            width=width+20;
            g.drawOval(x,y,width,height);
        }

    }
}

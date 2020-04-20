package h11;

import java.awt.*;
import java.applet.*;


public class Opdracht112 extends Applet {
    int getal,x;

    public void init() {
        x=50;
    }

    public void paint(Graphics g) {
        for (getal = 20; getal >= 10; getal--) {
            x=x+20;
            g.drawString(""+getal,x,50);
        }
    }
}
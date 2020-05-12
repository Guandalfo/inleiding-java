package h13;

import java.awt.*;
import java.applet.*;
import java.util.*;
import java.awt.event.*;


public class Opdracht131 extends Applet {

    public void paint(Graphics g) {
        tekenDriehoek(g,150,150,200,64,250,150);

    }

     void tekenDriehoek(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3) {
        g.drawLine(x1,y1,x2,y2);
        g.drawLine(x2,y2,x3,y3);
        g.drawLine(x1,y1,x3,y3);
    }
}

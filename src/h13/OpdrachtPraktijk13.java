package h13;

import java.awt.*;
import java.applet.*;
import java.util.*;
import java.awt.event.*;


public class OpdrachtPraktijk13 extends Applet {
    int x;
    int y;

    public void init() {
    }

    public void paint(Graphics g) {
        x=50;
            for (int teller = 0; teller < 5; teller++) {
                x = x + 300;
                y = 200;
                tekenBoom(g, x, y);
            }
            x=50;
        for (int teller = 0; teller < 5; teller++) {
            x = x + 300;
            y = 600;
            tekenBoom(g, x, y);
        }
        }
    public static final Color Brown = new Color(78, 48, 26);

    void tekenBoom(Graphics g,int x,int y){
        g.setColor(Brown);
        g.fillRect(x,y,30,200);
        g.setColor(Color.GREEN);
        x=x-110;
        y=y-100;
        g.fillOval(x,y,250,150);

    }
}


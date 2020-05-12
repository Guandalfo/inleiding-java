package h13;

import java.awt.*;
import java.applet.*;
import java.util.*;
import java.awt.event.*;


public class Opdracht132 extends Applet {


    public void paint(Graphics g) {
        tekenBakstenen(g,50);
        tekenBakstenen(g,70);
        tekenBakstenen(g,90);
        tekenBakstenen(g,110);
        tekenBakstenen(g,130);
        tekenBakstenen(g,150);
        tekenBakstenen(g,170);
        tekenBakstenen(g,190);
        tekenBakstenen(g,210);

    }

    public void tekenBakstenen(Graphics  g,int y) {
        setBackground(Color.BLACK);
        int x;
        x=50;
        for(int teller= 0;teller<10;teller++) {
            x=x+50;
            g.setColor(Color.red);
            g.fillRect(x, y, 50, 20);
            g.setColor(Color.white);
            g.drawRect(x,y,50,20);
        }

    }
}

package h13;

import java.awt.*;
import java.applet.*;
import java.util.*;
import java.awt.event.*;


public class Opdracht133 extends Applet {
    Button knop1, knop2;
    Boolean bakstenen, betonblokken;

    public void init() {
        bakstenen = false;
        betonblokken = false;
        knop1 = new Button("OK");
        knop2 = new Button("OK");
        add(knop1);
        add(knop2);
        knop1.addActionListener(new Knop1Listener());
        knop2.addActionListener(new Knop2Listener());
    }

    public void paint(Graphics g) {
        if (bakstenen) {
            tekenBakstenen(g, 100);
            tekenBakstenen(g, 120);
            tekenBakstenen(g, 140);
            tekenBakstenen(g, 160);
            tekenBakstenen(g, 180);
            tekenBakstenen(g, 200);
            tekenBakstenen(g, 220);
            tekenBakstenen(g, 240);
            tekenBakstenen(g, 260);
            tekenBakstenen(g, 280);
        }
        if(betonblokken){
            tekenbetonblokken(g,100);
            tekenbetonblokken(g,140);
            tekenbetonblokken(g,180);
            tekenbetonblokken(g,220);
            tekenbetonblokken(g,260);
            tekenbetonblokken(g,300);
            tekenbetonblokken(g,340);
            tekenbetonblokken(g,380);
            tekenbetonblokken(g,420);

        }

    }

    void tekenBakstenen(Graphics g, int y) {
        int x;
        x = 100;
        for (int teller = 0; teller < 10; teller++) {
            g.setColor(Color.RED);
            x = x + 50;
            g.fillRect(x, y, 50, 20);
            g.setColor(Color.LIGHT_GRAY);
            g.drawRect(x, y, 50, 20);
        }
    }
    void tekenbetonblokken(Graphics g,int y){
        int x;
        x=1000;
        for(int teller=0;teller<10;teller++){
            g.setColor(Color.GRAY);
            x=x+70;
            g.fillRect(x,y,70,40);
            g.setColor(Color.black);
            g.drawRect(x,y,70,40);
        }
    }

    class Knop1Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            bakstenen = true;
            repaint();
        }
    }

    class Knop2Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            betonblokken=true;
            repaint();
        }
    }
}

package h04;

import java.awt.*;
import java.applet.*;

public class OpdrachtPraktijk extends Applet {


    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawLine(10,10,150,10);
        g.drawRect(10,40,250,110);
        g.drawString("Lijn",30,30);
        g.drawString("Rechthoek",30,170);
        g.setColor(Color.magenta);
        g.fillRect(270,40,250,110);
        g.setColor(Color.black);
        g.drawOval(270,40,250,110);
        g.drawString("Gevulde rechthoek met ovaal",270,170);
        g.drawOval(530,40,250,110);
        g.setColor(Color.magenta);
        g.fillArc(530,40,250,110,0,45);
        g.setColor(Color.black);
        g.drawString("Taartpunt met ovaal eromheen",540,170);
        g.drawRoundRect(10,190,250,110,30,39);
        g.drawString("Afgeronde rechthoek",30,320);
        g.setColor(Color.magenta);
        g.fillOval(270,190,250,110);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal",280,320);
        g.drawOval(600,190,100,100);
        g.drawString("Cirkel",630,320);
    }
}


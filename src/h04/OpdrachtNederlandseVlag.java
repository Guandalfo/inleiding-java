package h04;


import java.awt.*;
import java.applet.*;

public class OpdrachtNederlandseVlag extends Applet {


    public void paint(Graphics g) {
        setBackground(Color.LIGHT_GRAY);
        g.setColor(Color.red);
        g.fillRect(150,150,450,100);
        g.setColor(Color.white);
        g.fillRect(150,250,450,100);
        g.setColor(Color.blue);
        g.fillRect(150,350,450,100);
        g.setColor(Color.black);
        g.fillRect(150,150,30,700);
        g.fillOval(130,100,80,80);
    }
}

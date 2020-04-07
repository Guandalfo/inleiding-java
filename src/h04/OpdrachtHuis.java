package h04;


import java.awt.*;
import java.applet.*;

public class OpdrachtHuis extends Applet {

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawRect(150,150,500,500);
        g.drawRect(180,400,150,150);
        g.drawLine(180,475,330,475);
        g.drawLine(255,400,255,550);
        g.drawLine(130,157,400,50);
        g.drawLine(670,157,400,50);
        g.drawRect(450,350,150,300);
        g.drawOval(560,500,30,30);
    }
}
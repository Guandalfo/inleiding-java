package h04;

import java.awt.*;
import java.applet.*;

public class OpdrachtStoplicht extends Applet {


    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(100,100,150,320);
        g.fillRect(160,400,30,350);
        g.setColor(Color.red);
        g.fillOval(140,150,70,70);
        g.setColor(Color.orange);
        g.fillOval(140,230,70,70);
        g.setColor(Color.green);
        g.fillOval(140,310,70,70);
    }
}

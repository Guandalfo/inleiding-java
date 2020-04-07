package h04;

import java.awt.*;
import java.applet.*;

public class OpdrachtDobbelsteen extends Applet {


    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawRect(100,100,200,200);
        g.fillOval(130,140,50,50);
        g.fillOval(220,140,50,50);
        g.fillOval(130,230,50,50);
        g.fillOval(220,230,50,50);
    }
}

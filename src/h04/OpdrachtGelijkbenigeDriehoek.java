package h04;

import java.awt.*;
import java.applet.*;

public class OpdrachtGelijkbenigeDriehoek extends Applet {


    public void paint(Graphics g) {
       g.setColor(Color.black);
       g.drawLine(150,20,100,100);
       g.drawLine(150,20,200,100);
       g.drawLine(100,100,200,100);
    }
}

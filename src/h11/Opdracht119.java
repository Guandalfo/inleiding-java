package h11;

import java.awt.*;
import java.applet.*;


public class Opdracht119 extends Applet {
    int h,w,x,y,teller,lijnen;
    Color cb,cw;

    public void init() {
        cb=Color.BLACK;
        cw=Color.WHITE;
    }

    public void paint(Graphics g) {
        h=20;
        w=20;
        x=50;
        y=50;
        setBackground(Color.gray);
       for(lijnen=0; lijnen<4;lijnen++) {
           for (teller = 0; teller < 4; teller++) {
               g.setColor(cb);
               x = x + 20;
               g.fillRect(x, y, w, h);
               g.setColor(cw);
               x = x + 20;
               g.fillRect(x, y, w, h);
           }
           x = x - 160;
           y = y + 20;
           for (teller = 0; teller < 4; teller++) {
               g.setColor(cw);
               x = x + 20;
               g.fillRect(x, y, w, h);
               g.setColor(cb);
               x = x + 20;
               g.fillRect(x, y, w, h);
           }
           x=x-160;
           y=y+20;

       }
    }
}

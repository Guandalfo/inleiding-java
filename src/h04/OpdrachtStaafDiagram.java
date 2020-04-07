package h04;

import java.awt.*;
import java.applet.*;

public class OpdrachtStaafDiagram extends Applet {


    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawRect(100,100,850,640);
        g.drawString("160-",70,105);
        g.drawString("0-",70,740);
        g.drawString("20-",70,660);
        g.drawString("40-",70,580);
        g.drawString("60-",70,500);
        g.drawString("80-",70,420);
        g.drawString("100-",70,340);
        g.drawString("120-",70,260);
        g.drawString("140-",70,180);
        g.setColor(Color.pink);
        g.fillRect(150,580,150,160);
        g.setColor(Color.green);
        g.fillRect(450,340,150,400);
        g.setColor(Color.blue);
        g.fillRect(750,420,150,320);
        g.setColor(Color.black);
        g.drawString("Valerie",195,760);
        g.drawString("Jeroen",495,760);
        g.drawString("Hans",795,760);
        g.drawString("Gewicht in Kilo's",50,800);
    }
}


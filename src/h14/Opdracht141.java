package h14;

import java.awt.*;
import java.applet.*;
import java.util.*;
import java.awt.event.*;


public class Opdracht141 extends Applet {
    double random1,random2;
    int kaarttype,kaartgetal;

    public void init() {
        //Kaarttype(Harten,schoppen,ruiten,klaver)
        random1=Math.random();
        kaarttype=(int)(random1*4+1);
        //Kaartgetal(A,2,3,4,5,6,7,8,9,10,V,B,K)
        random2=Math.random();
        kaartgetal=(int)(random2*13+1);
    }

    public void paint(Graphics g) {
        tekenKaart(g);

    }
    void tekenKaart(Graphics g) {
        //harten
        if (kaarttype == 1) {
            g.setColor(Color.BLACK);
            g.drawRect(400, 300, 200, 400);
            g.setColor(Color.RED);
            int[] x = {500, 470, 530};
            int[] y = {500, 450, 450};
            g.fillPolygon(x, y, 3);
            g.fillOval(471, 440, 30, 30);
            g.fillOval(499, 440, 30, 30);
        }
        //ruiten
        if (kaarttype == 2) {
            g.setColor(Color.BLACK);
            g.drawRect(400, 300, 200, 400);
            g.setColor(Color.RED);
            int[] x1 = {500, 470, 530};
            int[] y1 = {500, 450, 450};
            int[] x2 = {500, 470, 530};
            int[] y2 = {400, 450, 450};
            g.fillPolygon(x1, y1, 3);
            g.fillPolygon(x2, y2, 3);
        }
        //schoppen
        if (kaarttype == 3) {
            g.setColor(Color.BLACK);
            g.drawRect(400, 300, 200, 400);
            int[] x2 = {500, 470, 530};
            int[] y2 = {400, 450, 450};
            g.fillPolygon(x2, y2, 3);
            g.fillOval(471, 440, 30, 30);
            g.fillOval(499, 440, 30, 30);
            g.drawLine(470, 400, 530, 400);
        }
        //klaver
        if (kaarttype == 4) {
            g.setColor(Color.BLACK);
            g.drawRect(400, 300, 200, 400);
            g.fillOval(471, 440, 30, 30);
            g.fillOval(499, 440, 30, 30);
            g.fillOval(485, 420, 30, 30);
            g.drawLine(500, 480, 500, 440);
            g.drawLine(490, 480, 510, 480);
        }
        g.setColor(Color.BLACK);
        switch(kaartgetal){
            case 1:
                g.drawString("A",500,550);
                break;
            case 2:
                g.drawString("2",500,550);
                break;
            case 3:
                g.drawString("3",500,550);
                break;
            case 4:
                g.drawString("4",500,550);
                break;
            case 5:
                g.drawString("5",500,550);
                break;
            case 6:
                g.drawString("6",500,550);
                break;
            case 7:
                g.drawString("7",500,550);
                break;
            case 8:
                g.drawString("8",500,550);
                break;
            case 9:
                g.drawString("9",500,550);
                break;
            case 10:
                g.drawString("10",500,550);
                break;
            case 11:
                g.drawString("V",500,550);
                break;
            case 12:
                g.drawString("B",500,550);
                break;
            case 13:
                g.drawString("K",500,550);
                break;
        }
    }
}

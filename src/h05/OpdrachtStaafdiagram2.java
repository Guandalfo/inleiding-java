package h05;

import java.awt.*;
import java.applet.*;

public class OpdrachtStaafdiagram2 extends Applet {
    Color lijn;
    int gewichtvalerie;
    int gewichtjeroen;
    int gewichthans;
    int y160;
    int y140;
    int y120;
    int y100;
    int y80;
    int y60;
    int y40;
    int y20;
    int y0;
    int xlijn;
    int yhoogtevalerie;
    int yhoogtejeroen;
    int yhoogtehans;
    int lengtevalerie;
    int lengtejeroen;
    int lengtehans;
    int lengtelijn;
    int verticalelijn;


    public void init() {
        lijn = Color.black;
        xlijn=100;
        gewichtvalerie = 40;
        gewichtjeroen=100;
        gewichthans=80;
        yhoogtevalerie=740-gewichtvalerie*4;
        yhoogtejeroen=740-gewichtjeroen*4;
        yhoogtehans=740-gewichthans*4;
        lengtevalerie=gewichtvalerie*4;
        lengtejeroen=gewichtjeroen*4;
        lengtehans=gewichthans*4;
        y160=105;
        y140=180;
        y120=260;
        y100=340;
        y80=420;
        y60=500;
        y40=580;
        y20=660;
        y0=740;
        lengtelijn=950;
        verticalelijn=760;
    }


    public void paint(Graphics g) {
        g.setColor(lijn);
        g.drawRect(100, 100, 850, 640);
        g.drawString("160-", 70, y160);
        g.drawString("0-", 70, y0);
        g.drawString("20-", 70, y20);
        g.drawString("40-", 70, y40);
        g.drawString("60-", 70, y60);
        g.drawString("80-", 70, y80);
        g.drawString("100-", 70, y100);
        g.drawString("120-", 70, y120);
        g.drawString("140-", 70, y140);
        g.drawString("Valerie",195,verticalelijn);
        g.drawString("Jeroen",495,verticalelijn);
        g.drawString("Hans",795,verticalelijn);
        g.drawString("Gewicht in kilo's",70,800);
        g.drawLine(xlijn,y140,lengtelijn,y140);
        g.drawLine(xlijn,y120,lengtelijn,y120);
        g.drawLine(xlijn,y100,lengtelijn,y100);
        g.drawLine(xlijn,y80,lengtelijn,y80);
        g.drawLine(xlijn,y60,lengtelijn,y60);
        g.drawLine(xlijn,y40,lengtelijn,y40);
        g.drawLine(xlijn,y20,lengtelijn,y20);
        g.setColor(Color.pink);
        g.fillRect(150,yhoogtevalerie,150,lengtevalerie);
        g.setColor(Color.green);
        g.fillRect(450,yhoogtejeroen,150,lengtejeroen);
        g.setColor(Color.blue);
        g.fillRect(750,yhoogtehans,150,lengtehans);
    }
}


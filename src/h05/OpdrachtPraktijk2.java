package h05;

import java.awt.*;
import java.applet.*;

public class OpdrachtPraktijk2 extends Applet{
    Color vulkleur;
    Color lijnkleur;
    int   breedte;
    int   hoogte;
    int   afgerondehoek;
    int   ylijn1;
    int   ylijn2;
    int   xlijn1;
    int   xlijn2;
    int   xlijn3;
    int   hoekcirkel;
    int   ytxtlijn1;
    int   ytxtlijn2;
    int   xtxtlijn1;
    int   xtxtlijn2;
    int   xtxtlijn3;

    public void init() {
        vulkleur= Color.MAGENTA;
        lijnkleur=Color.BLACK;
        breedte=200;
        hoogte=100;
        afgerondehoek=30;
        ylijn1=80;
        ylijn2=220;
        xlijn1=30;
        xlijn2=240;
        xlijn3=450;
        hoekcirkel=90;
        ytxtlijn1=200;
        ytxtlijn2=340;
        xtxtlijn1=30;
        xtxtlijn2=240;
        xtxtlijn3=450;
    }

    public void paint(Graphics g) {
        g.setColor(lijnkleur);
        g.drawLine(xlijn1,20,230,20);
        g.drawRect(xlijn1,ylijn1,breedte,hoogte);
        g.setColor(vulkleur);
        g.fillRect(xlijn2,ylijn1,breedte,hoogte);
        g.setColor(lijnkleur);
        g.drawOval(xlijn2,ylijn1,breedte,hoogte);
        g.drawOval(xlijn3,ylijn1,breedte,hoogte);
        g.setColor(vulkleur);
        g.fillArc(xlijn3,ylijn1,breedte,hoogte,0,45);
        g.setColor(lijnkleur);
        g.drawRoundRect(xlijn1,ylijn2,breedte,hoogte,afgerondehoek,afgerondehoek);
        g.setColor(vulkleur);
        g.fillOval(xlijn2,ylijn2,breedte,hoogte);
        g.setColor(lijnkleur);
        g.drawOval(500,ylijn2,hoekcirkel,hoekcirkel);
        g.drawString("Rechthoek",xtxtlijn1,ytxtlijn1);
        g.drawString("Gevulde rechthoek met ovaal",xtxtlijn2,ytxtlijn1);
        g.drawString("Taartpunt met ovaal eromheen",xtxtlijn3,ytxtlijn1);
        g.drawString("Afgeronde rechthoek",xtxtlijn1,ytxtlijn2);
        g.drawString("Gevulde ovaal",xtxtlijn2,ytxtlijn2);
        g.drawString("Cirkel",525,ytxtlijn2);
        g.drawString("Lijn",xtxtlijn1,40);
    }
}

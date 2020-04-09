package h06;

import java.awt.*;
import java.applet.*;

public class OpdrachtVerdelingGeld extends Applet {
    double verdeeldgeld,aantalmensen,geld;

    public void init() {
        geld=113;
        aantalmensen=4;
        verdeeldgeld= geld / aantalmensen;
    }


    public void paint(Graphics g) {
        g.drawString("Totaal geld:" + geld,50,30);
        g.drawString("Jan:" + verdeeldgeld,50,50);
        g.drawString("Ali:" + verdeeldgeld,50,70);
        g.drawString("Jeannette:" + verdeeldgeld,50,90);
        g.drawString("Nova:" + verdeeldgeld,50,110);
    }

}
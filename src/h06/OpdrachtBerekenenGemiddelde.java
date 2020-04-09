package h06;

import java.awt.*;
import java.applet.*;

public class OpdrachtBerekenenGemiddelde extends Applet {
    int  geheel;
    double  a,b,c,gemiddelde;



    public void init() {
        a=5.9;
        b=6.3;
        c=6.9;
        gemiddelde=(a+b+c)/3;
        gemiddelde=gemiddelde*10;
        geheel= (int) gemiddelde;
        geheel=geheel/10;
        gemiddelde=geheel;

    }


    public void paint(Graphics g) {
        g.drawString("" + gemiddelde,50,50);

    }

}
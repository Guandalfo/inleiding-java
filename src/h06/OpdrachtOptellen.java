package h06;

import java.awt.*;
import java.applet.*;

public class OpdrachtOptellen extends Applet {
    int  a,b,c,antwoord;


    public void init() {
        a=4;
        b=6;
        c=a+b;
        antwoord=-1*c;
    }


    public void paint(Graphics g) {
        g.drawString("4+6=",20,50);
        g.drawString("" + antwoord,50,50);


    }

}

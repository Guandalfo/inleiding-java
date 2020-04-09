package h06;

import java.awt.*;
import java.applet.*;

public class OpdrachtBerekeningJaar extends Applet {
    double  seconden,minuut,uur,dag,jaar;



    public void init() {
        seconden=1;
        minuut=seconden*60;
        uur=minuut*60;
        dag=uur*24;
        jaar=dag*365;

    }


    public void paint(Graphics g) {
        g.drawString("Seconden in uur: " + uur,50,50);
        g.drawString("Seconden in dag: " + dag,50,70);
        g.drawString("Seconden in jaar: " + jaar,50,90);

    }

}
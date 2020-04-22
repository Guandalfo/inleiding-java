package h12;

import java.awt.*;
import java.applet.*;


public class Opdracht121 extends Applet {
    int  teller;
    int gemiddelde;
    int[] getallen;
    double geheel,gemiddelde2;


    public void init() {
        getallen = new int[10];
        getallen[0] = 10;
        getallen[1] = 3;
        getallen[2] = 8;
        getallen[3] = 12;
        getallen[4] = 4;
        getallen[5] = 6;
        getallen[6] = 7;
        getallen[7] = 11;
        getallen[8] = 2;
        getallen[9] = 1;
        for (int i : getallen) {
            geheel = i + geheel;
            gemiddelde2 = geheel / getallen.length;
        }
    }

        public void paint(Graphics g){
            for (teller = 0; teller < getallen.length; teller++) {
                g.drawString("" + getallen[teller], 50 * teller + 30, 50);
                g.drawString("Gemiddelde:  " + gemiddelde2, 50, 80);
            }
    }
}

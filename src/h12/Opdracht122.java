package h12;

import java.awt.*;
import java.applet.*;
import java.util.*;
import java.awt.event.*;


public class Opdracht122 extends Applet {
    Button[] knoppen;

    public void init() {
        knoppen=new Button[25];
        for (int teller = 0; teller < 25; teller++) {
            knoppen[teller]=new Button();
            add(knoppen[teller]);
        }
    }
    public void paint(Graphics g) {

    }
}

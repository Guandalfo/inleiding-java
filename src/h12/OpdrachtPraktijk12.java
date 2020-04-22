package h12;


import java.awt.*;
import java.applet.*;
import java.util.*;
import java.awt.event.*;


public class OpdrachtPraktijk12 extends Applet {
    Button knop;
    TextField tekstvak1, tekstvak2;
    String[] input1;
    String[] input2;
    int teller1;

    public void init() {
        knop = new Button("OK");
        tekstvak1 = new TextField("", 30);
        tekstvak2 = new TextField("", 20);
        add(tekstvak1);
        add(tekstvak2);
        add(knop);
        knop.addActionListener(new knopListener());
    }

    public void paint(Graphics g) {
        if (teller1 == 10) {
            for (int teller = 0; teller < 10; teller++) {
                g.drawString("Telefoonnummers:  ", 50, 50);
                g.drawString("" + input1[teller], 50, 20 * teller + 50);
                g.drawString("Namen:   ", 300, 50);
                g.drawString("" + input2[teller], 300, 20 * teller + 50);
            }
        }
    }

    class knopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            input1 = new String[10];
            for(int teller=0;teller<input1.length;teller++) {
                input1[teller] = tekstvak1.getText();
            }
            input2 = new String[10];
            for(int teller=0; teller<input2.length; teller++){
                input2[teller] =tekstvak2.getText();
            }
            tekstvak2.setText("");
            tekstvak1.setText("");
            teller1++;
            repaint();
            }
        }
    }
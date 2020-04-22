package h12;

import java.awt.*;
import java.applet.*;
import java.util.*;
import java.awt.event.*;


public class Opdracht123 extends Applet {
    Button knop;
    TextField[] tekstvakken;

    public void init() {
        tekstvakken = new TextField[5];
        tekstvakken[0] = new TextField("", 10);
        tekstvakken[1] = new TextField("", 10);
        tekstvakken[2] = new TextField("", 10);
        tekstvakken[3] = new TextField("", 10);
        tekstvakken[4] = new TextField("", 10);
        for (TextField textField : tekstvakken) {
            add(textField);
        }
        knop = new Button("OK");
        add(knop);
        knop.addActionListener(new KnopListener());
    }

    public void paint(Graphics g) {

    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int[] values = new int[5];
            values[0] = Integer.parseInt(tekstvakken[0].getText());
            values[1] = Integer.parseInt(tekstvakken[1].getText());
            values[2] = Integer.parseInt(tekstvakken[2].getText());
            values[3] = Integer.parseInt(tekstvakken[3].getText());
            values[4] = Integer.parseInt(tekstvakken[4].getText());
            Arrays.sort(values);
            tekstvakken[0].setText(""+values[0]);
            tekstvakken[1].setText(""+values[1]);
            tekstvakken[2].setText(""+values[2]);
            tekstvakken[3].setText(""+values[3]);
            tekstvakken[4].setText(""+values[4]);
            repaint();

        }
    }
}


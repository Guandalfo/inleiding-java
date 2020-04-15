package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht82 extends Applet {
    Button kman,kvrouw,kjongen,kmeisje;
    int    man,vrouw,jongen,meisje,totaal;

    public void init() {
        totaal=man+vrouw+jongen+meisje;
        kman = new Button();
        kman.setLabel( "Man" );
        add(kman);
        kvrouw = new Button();
        kvrouw.setLabel( "Vrouw" );
        add(kvrouw);
        kjongen = new Button();
        kjongen.setLabel( "Jongen" );
        add(kjongen);
        kmeisje = new Button();
        kmeisje.setLabel( "Meisje" );
        add(kmeisje);
        kman.addActionListener( new KmanListener() );
        kvrouw.addActionListener( new KvrouwListener() );
        kjongen.addActionListener( new KjongenListener() );
        kmeisje.addActionListener( new KmeisjeListener() );

    }

    public void paint(Graphics g) {
        g.drawString(""+man,110,50);
        g.drawString(""+vrouw,160,50);
        g.drawString(""+jongen,212,50);
        g.drawString(""+meisje,270,50);
        g.drawString("Totaal  "+totaal,170,80);


    }
    class KmanListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            man++;
            totaal++;
            repaint();
        }
    }
    class KvrouwListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            vrouw++;
            totaal++;
            repaint();
        }
    }
    class KjongenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            jongen++;
            totaal++;
            repaint();
        }
    }
    class KmeisjeListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            meisje++;
            totaal++;
            repaint();
        }
    }

}



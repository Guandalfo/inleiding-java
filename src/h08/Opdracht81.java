package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht81 extends Applet {
    Button okknop,resetknop;
    String s;
    TextField tekstvak;
    Label label;


    public void init() {
        tekstvak= new TextField("",20);
        label = new Label("Naam:");
        add(label);
        add(tekstvak);
        s="";
        okknop = new Button();
        okknop.setLabel( "OK" );
        KnopListener kl = new KnopListener();
        okknop.addActionListener( kl );
        add(okknop);
        resetknop=new Button();
        resetknop.setLabel("Reset");
        resetknop.addActionListener( new ResetKnopListener() );
        add(resetknop);



    }

    public void paint(Graphics g) {
        g.drawString(s,75,60);

    }


    class KnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            s = tekstvak.getText();
            repaint();
        }
    }
    class ResetKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("");
            s=tekstvak.getText();
            repaint();

        }
    }
}

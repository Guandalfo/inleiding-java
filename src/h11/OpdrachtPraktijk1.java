package h11;


import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class OpdrachtPraktijk1 extends Applet {
    int getal, keergetal, antwoord, y;
    Button knop;
    TextField tekstvak;

    public void init() {
        knop = new Button();
        knop.setLabel("OK");
        tekstvak = new TextField("",20);
        add(tekstvak);
        add(knop);
        knop.addActionListener(new KnopListener());
        y = 50;
        antwoord = 0;
    }

    public void paint(Graphics g) {
        for(keergetal=1;keergetal<11;keergetal++){
            switch(getal){
                case 1:
                    getal=1;
                    y=y+20;
                    antwoord=getal*keergetal;
                    g.drawString(""+getal+"  *  "+keergetal+"  =  "+antwoord,50,y);
                    break;
                case 2:
                    getal=2;
                    y=y+20;
                    antwoord=getal*keergetal;
                    g.drawString(""+getal+"  *  "+keergetal+"  =  "+antwoord,50,y);
                    break;
                case 3:
                    getal=3;
                    y=y+20;
                    antwoord=getal*keergetal;
                    g.drawString(""+getal+"  *  "+keergetal+"  =  "+antwoord,50,y);
                    break;
                case 4:
                    getal=4;
                    y=y+20;
                    antwoord=getal*keergetal;
                    g.drawString(""+getal+"  *  "+keergetal+"  =  "+antwoord,50,y);
                    break;
                case 5:
                    getal=5;
                    y=y+20;
                    antwoord=getal*keergetal;
                    g.drawString(""+getal+"  *  "+keergetal+"  =  "+antwoord,50,y);
                    break;
                case 6:
                    getal=6;
                    y=y+20;
                    antwoord=getal*keergetal;
                    g.drawString(""+getal+"  *  "+keergetal+"  =  "+antwoord,50,y);
                    break;
                case 7:
                    getal=7;
                    y=y+20;
                    antwoord=getal*keergetal;
                    g.drawString(""+getal+"  *  "+keergetal+"  =  "+antwoord,50,y);
                    break;
                case 8:
                    getal=8;
                    y=y+20;
                    antwoord=getal*keergetal;
                    g.drawString(""+getal+"  *  "+keergetal+"  =  "+antwoord,50,y);
                    break;
                case 9:
                    getal=9;
                    y=y+20;
                    antwoord=getal*keergetal;
                    g.drawString(""+getal+"  *  "+keergetal+"  =  "+antwoord,50,y);
                    break;
                case 10:
                    getal=10;
                    y=y+20;
                    antwoord=getal*keergetal;
                    g.drawString(""+getal+"  *  "+keergetal+"  =  "+antwoord,50,y);
                    break;
            }
        }


    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("");
            String s = tekstvak.getText();
            getal= Integer.parseInt(s);
            repaint();
        }
    }
}
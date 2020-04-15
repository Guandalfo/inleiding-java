package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht103 extends Applet {
    int getal,jaartal;
    String maand,dagen;
    TextField tekstvak,tekstvak2;
    Button knop;
    Label label,label2;


    public void init() {
        knop= new Button();
        knop.setLabel("OK");
        tekstvak= new TextField("",20);
        tekstvak2= new TextField("",20);
        label= new Label("Maandnummer: ");
        label2= new Label("Jaar: ");
        add(label);
        add(tekstvak);
        add(label2);
        add(tekstvak2);
        add(knop);
        knop.addActionListener( new KnopListener() );
        maand="";
        dagen="";
    }


    public void paint(Graphics g) {
        g.drawString("Maand: "+maand,40,50);
        g.drawString("Dagen :"+dagen,40,70);


    }
    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Integer.parseInt(s);
            String t = tekstvak2.getText();
            jaartal = Integer.parseInt(t);
            switch(getal){
                case 1:
                    maand="januari";
                    dagen="31";
                    break;
                case 2:
                    if((jaartal%4==0&&!(jaartal % 100 == 0))||jaartal%400==0) {
                        dagen="29";
                    }
                    else{
                        dagen="28";
                    }
                    maand="februari";
                    break;
                case 3:
                    maand="maart";
                    dagen="31";
                    break;
                case 4:
                    maand="april";
                    dagen="30";
                    break;
                case 5:
                    maand="mei";
                    dagen="31";
                    break;
                case 6:
                    maand="juni";
                    dagen="30";
                    break;
                case 7:
                    maand="juli";
                    dagen="31";
                    break;
                case 8:
                    maand="augustus";
                    dagen="31";
                    break;
                case 9:
                    maand="september";
                    dagen="30";
                    break;
                case 10:
                    maand="oktober";
                    dagen="31";
                    break;
                case 11:
                    maand="november";
                    dagen="30";
                    break;
                case 12:
                    maand="december";
                    dagen="31";
                    break;
            }
            repaint();

        }
    }
}
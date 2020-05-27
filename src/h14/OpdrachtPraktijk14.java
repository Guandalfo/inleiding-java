package h14;

import java.awt.*;
import java.applet.*;
import java.util.*;
import java.awt.event.*;


public class OpdrachtPraktijk14 extends Applet {
    int[] stenen = new int[23];
    Button knop;
    Label label;
    TextField tekstvak;
    int playerKeuze;
    String tekst;
    int playerRonde;
    int computerKeuze;
    Boolean start;
    int computerRonde;
    String winnaar;


    public void init() {
        winnaar="";
        tekst="";
        knop = new Button("Speel");
        label = new Label("Hoeveel Stenen neem je (één, twee of drie)?");
        tekstvak = new TextField("", 20);
        add(label);
        add(tekstvak);
        add(knop);
        knop.addActionListener(new knopListener());
        for (int i = 0; i < stenen.length; i++) {
            stenen[i] = i + 1;
        }
    }

    public void paint(Graphics g) {
        g.drawString(""+tekst,800,100);
        if(start&&stenen.length>0) {
            computerKiest();
            showOverzicht(g);
        }
        g.drawString(""+winnaar,800,100);
    }
    public void showOverzicht(Graphics g){
        if(stenen.length>0) {
            g.drawString("Computer haalt  " + computerKeuze + "   weg", 600, 100);
            g.drawString("Jij haalt   " + playerKeuze + "   weg", 600, 150);
        }
        for (int i = 0; i <stenen.length; i++) {
            g.drawString("" + stenen[i], 50 * i + 500, 300);
        }
    }
    public void computerKiest(){

        switch(playerKeuze){
            case 1:
                if(playerRonde==1) {
                    computerKeuze = 2;
                }
                else{
                    computerKeuze=3;
                }
                minStenen(computerKeuze);
                computerRonde++;
                break;
            case 2:
                if(playerRonde==1){
                    computerKeuze=1;
                }
                else{
                    computerKeuze=2;
                }
                minStenen(computerKeuze);
                computerRonde++;
                break;
            case 3:
                if(playerRonde==1){
                    computerKeuze=3;
                }
                else{
                    computerKeuze=1;
                }
                minStenen(computerKeuze);
                computerRonde++;
                break;
        }
    }

    public void minStenen(int mingetal) {
        int[] copyStenen=new int[stenen.length-mingetal];


        if (stenen.length - mingetal >= 0) System.arraycopy(stenen, 0, copyStenen, 0, stenen.length - mingetal);
        stenen=copyStenen;
        if(stenen.length==0&&playerKeuze==mingetal){
            winnaar="Computer wint...";
        }
        else if(stenen.length==0&&computerKeuze==mingetal){
            winnaar="Jij wint!";
        }

    }

    class knopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            playerKeuze = Integer.parseInt(s);
            tekstvak.setText("");
            switch(playerKeuze){
                case 1:
                    System.out.println(playerKeuze);
                    tekst="";
                    playerKeuze=1;
                    playerRonde++;
                    minStenen(playerKeuze);
                    start=true;
                    break;
                case 2:
                    tekst="";
                    playerKeuze=2;
                    playerRonde++;
                    minStenen(playerKeuze);
                    start=true;
                    break;
                case 3:
                    tekst="";
                    playerKeuze=3;
                    playerRonde++;
                    minStenen(playerKeuze);
                    start=true;
                    break;
                default:
                    tekst="Dat is geen optie, probeer het opnieuw";
                    playerKeuze=0;
                    computerKeuze=0;
                    break;
            }
            repaint();
        }
    }
}

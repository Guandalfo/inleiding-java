package h14;

//Steen papier schaar gemaakt om te oefenen


import java.awt.*;
import java.applet.*;
import java.util.*;
import java.awt.event.*;


public class SteenPapierSchaar extends Applet {
    Button knopSteen, knopPapier, knopSchaar;
    int Pkeuze,Ckeuze;
    int steen,papier,schaar;
    String uitslag;
    int scorePlayer,scoreComputer;

    public void init() {
        scorePlayer=0;
        scoreComputer=0;
        Pkeuze=0;
        Ckeuze=0;
        uitslag="";
        steen=1;
        papier=2;
        schaar=3;
        knopSteen = new Button("Steen");
        knopPapier = new Button("Papier");
        knopSchaar = new Button("Schaar");
        add(knopSteen);
        add(knopPapier);
        add(knopSchaar);
        knopSteen.addActionListener(new knopSteenListener());
        knopPapier.addActionListener(new knopPapierListener());
        knopSchaar.addActionListener(new knopSchaarListener());


    }

    public void paint(Graphics g) {
        if(Pkeuze!=0&&Ckeuze!=0) {
            kiesWinnaar(g);
        }
    }
    public void kiesWinnaar(Graphics g){
        switch(Pkeuze){
            case 1:
                if(Ckeuze==schaar) {
                    uitslag = "Jij wint!";
                    scorePlayer++;
                }
                else if(Ckeuze==papier){
                    uitslag="Computer wint";
                    scoreComputer++;
                }
                else{
                    uitslag="Gelijkspel";
                }
                break;
            case 2:
                if(Ckeuze==steen){
                    uitslag="Jij wint!";
                    scorePlayer++;
                }
                else if(Ckeuze==schaar){
                    uitslag="Computer wint";
                    scoreComputer++;
                }
                else{
                    uitslag="Gelijkspel";
                }
                break;
            case 3:
                if(Ckeuze==papier){
                    uitslag="Jij wint!";
                    scorePlayer++;
                }
                else if(Ckeuze==steen){
                    uitslag="Computer wint";
                    scoreComputer++;
                }
                else{
                    uitslag="Gelijkspel";
                }
                break;
        }
        g.drawString("   "+uitslag,100,100);
        if(Pkeuze!=0&&Ckeuze!=0) {
            switch(Ckeuze){
                case 1:
                    g.drawString("Computer:  Steen", 100, 200);
                    break;
                case 2:
                    g.drawString("Computer:  Papier", 100, 200);
                    break;
                case 3:
                    g.drawString("Computer:  Schaar", 100, 200);
                    break;
            }
            switch(Pkeuze){
                case 1:
                    g.drawString("Speler:  Steen", 100, 300);
                    break;
                case 2:
                    g.drawString("Speler:  Papier", 100, 300);
                    break;
                case 3:
                    g.drawString("Speler:  Schaar", 100, 300);
                    break;
            }
        }
        if(scoreComputer==10){
            g.drawString("De Computer wint..",500,200);
            scoreComputer=0;
            Ckeuze=0;
            scorePlayer=0;
            Pkeuze=0;

        }
        else if(scorePlayer==10){
            g.drawString("Jij wint!",500,200);
            scorePlayer=0;
            Pkeuze=0;
            scoreComputer=0;
            Ckeuze=0;
        }
        g.drawString("Score:   "+scoreComputer+"  |  ",100,400);
        g.drawString(""+scorePlayer,200,400);
    }
    public void computerKeuze(){
        double r=Math.random();
        int keuze=(int)(r*3+1);
        if(keuze==1){
            Ckeuze=steen;
        }
        else if(keuze==2){
            Ckeuze=papier;
        }
        else if(keuze==3){
            Ckeuze=schaar;
        }

    }

    class knopSteenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Pkeuze=steen;
            computerKeuze();
            repaint();

        }

    }

    class knopPapierListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Pkeuze=papier;
            computerKeuze();
            repaint();

        }
    }

    class knopSchaarListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Pkeuze=schaar;
            computerKeuze();
            repaint();

        }
    }
}
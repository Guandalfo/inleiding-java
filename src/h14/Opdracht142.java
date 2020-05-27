package h14;

import java.awt.*;
import java.applet.*;
import java.util.*;
import java.net.URL;


public class Opdracht142 extends Applet {
    private AudioClip sound;
    String[] deck=new String[52];
    String[] suits = {"Harten  ", "Ruiten  ", "Schoppen  ", "Klaver  "};
    String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Boer", "Konining", "Koning", "Aas"};
    String[] Speler1=new String[13];
    String[] Speler2=new String[13];
    String[] Speler3=new String[13];
    String[] Speler4=new String[13];


    public void init() {
        URL pad = Opdracht142.class.getResource("./resources/");
        sound = getAudioClip(pad, "check.wav");
        int deckIndex = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[deckIndex] = suit + rank;
                System.out.println(deck[deckIndex]);
                deckIndex++;
            }
        }
        deelDeKaarten();
    }

    public void paint(Graphics g) {
        for (int j = 0; j < 13; j++) {
            g.drawString("Speler 1:   ", 50, 100);
            g.drawString("" + Speler1[j], 50, 50 * j + 150);
            g.drawString("Speler 2:   ",250,100);
            g.drawString(""+Speler2[j],250,50*j+150);
            g.drawString("Speler 3:   ",450,100);
            g.drawString(""+Speler3[j],450,50*j+150);
            g.drawString("Speler 4:   ",650,100);
            g.drawString(""+Speler4[j],650,50*j+150);
            sound.play();
        }
    }
    public void deelDeKaarten(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 13; j++) {
                if(i==1) {
                    Speler1[j] = deelKaart();
                }
                if(i==2){
                    Speler2[j] = deelKaart();
                }
                if(i==3){
                    Speler3[j] = deelKaart();
                }
                if (i == 4) {
                    Speler4[j] = deelKaart();
                }
            }
        }
    }

    private String deelKaart() {
        int random = new Random().nextInt(deck.length);
        String kaart = deck[random];

        String[] hulpLijst = new String[deck.length - 1];

        int hulpindex = 0;

        for (int i = 0; i < deck.length; i++) {
            if (i != random) {
                hulpLijst[hulpindex] = deck[i];
                hulpindex++;
            }
        }

        deck = hulpLijst;

        return kaart;
    }

}

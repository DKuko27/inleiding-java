package Hoofdstuk6;

import java.applet.Applet;
import java.awt.*;

public class Opdracht6_2 extends Applet {

    int  minuut;
    int uur;
    int dag;
    int jaar;

    public void init(){

        minuut =60;
        uur = minuut*60;
        dag = uur*24;
        jaar = dag*365;

        setSize(800,800);
        setBackground(Color.BLACK);

    }

    public void paint(Graphics g){

        //Kleur van alles oop het beeldscherm
        g.setColor(Color.WHITE);


        g.drawString("In een uur zitten " + uur + " seconden", 40,180);
        g.drawString("In een dag zit " + dag + " uur", 40,205);
        g.drawString("In een jaar zit " + jaar + " dagen",40,230);

        //Strepen die de texten onderscheiden.
        g.drawLine(40,185, 250,185);
        g.drawLine(40,210, 250,210);
        g.drawLine(40,235, 250,235);
    }

}

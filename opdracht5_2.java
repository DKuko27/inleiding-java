import javax.swing.*;
import java.awt.*;
import java.applet.*;

//een klasse met de naam Show van het type Applet.
public class opdracht5_2 extends Applet {

    int JeroenGewicht;
    int HansGewicht;
    int ValerieGewicht;

    int hoogteXAs;

    //De betekenis van wat de letters op het scherm zijn + achtergrond kleur.
    public void init() {

        hoogteXAs = 360;

        setSize(600, 600);
        setBackground(Color.WHITE);

        //Gewichten van de personen
        JeroenGewicht = 100;
        HansGewicht = 80;
        ValerieGewicht = 40;

    }
    public void paint (Graphics g){

        //verticale lijn
        g.drawLine(140, hoogteXAs, 140, 150);

        //horizontale lijn
        g.drawLine(340,hoogteXAs,140,hoogteXAs);

        //hoeveelheden
        g.drawString("0",110, 370);
        g.drawString("20",110,345);
        g.drawString("40",110,327);
        g.drawString("60",110,306);
        g.drawString("80",110, 285);
        g.drawString("100", 110,263);

        //Namen
        g.drawString("jeroen",140,380);
        g.drawString("Valerie",190,380);
        g.drawString("Hans",240,380);



        //Eerste Balk
        g.setColor(Color.BLUE);
        g.fillRect(140,hoogteXAs - JeroenGewicht,50, JeroenGewicht);
        //Tweede Balk
        g.setColor(Color.YELLOW);
        g.fillRect(190,hoogteXAs - ValerieGewicht,50,ValerieGewicht);
        //Derde Balk
        g.setColor(Color.GREEN);
        g.fillRect(240,hoogteXAs - HansGewicht,50,HansGewicht);


    }

}




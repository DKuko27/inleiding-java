import javax.swing.*;
import java.awt.*;
import java.applet.*;

//een klasse met de naam Show van het type Applet.
public class opdracht4_4 extends Applet {

    //De betekenis van wat de letters op het scherm zijn + achtergrond kleur.
    public void init() {

        setSize(600, 600);
        setBackground(Color.WHITE);

    }
    public void paint (Graphics g){

        //verticale lijn
        g.drawLine(140, 250, 140, 90);

        //hoeveelheden
        g.drawString("0",110,250);
        g.drawString("20",110,220);
        g.drawString("40",110,190);
        g.drawString("60",110,162);
        g.drawString("80",110,135);
        g.drawString("100",110,100);

        //Namen
        g.drawString("jeroen",140,270);
        g.drawString("Valerie",190,270);
        g.drawString("Hans",240,270);

        //horizontale lijn
        g.drawLine(350,250,140,250);

        //Eerste Balk
        g.setColor(Color.BLUE);
        g.fillRect(140,90,50,160);
        //Tweede Balk
        g.setColor(Color.YELLOW);
        g.fillRect(190,185,50,65);
        //Derde Balk
        g.setColor(Color.GREEN);
        g.fillRect(240,130,50,120);


    }

}




import java.awt.*;
import java.applet.*;

//een klasse met de naam Show van het type Applet.
public class Opdracht1 extends Applet {

    String voornaam;
    String achternaam;

    //De betekenis van wat de letters op het scherm zijn + achtergrond kleur.
    public void init() {

        voornaam = "Damir";
        achternaam = "Kuko";
        setSize(200,200);
        setBackground(Color.gray);

    }
    //De letters op het scherm met de kleuren daarvan.
    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Damir", 50, 60 );
        g.setColor(Color.red);
        g.drawString("Kuko",60,70);

        //Dak van het Huis.
        g.setColor(Color.BLACK);
        g.drawLine(70,120,120,120);
        g.drawLine(70,120,95,95);
        g.drawLine(95,95,120,120);

       //Het huis zelf.
        g.drawRect(70,120,50,50);

       //De twee ramen van het huis.
        g.drawRect(77,130,10,10);
        g.drawRect(102,130,10,10);

       //Het deur van het huis.
        g.drawRect(102,150,10,20);

       //Stok van de vlag.
        g.drawLine(140,170,140,90);

       //De vlag zelf.
        g.setColor(Color.BLUE);
        g.fillRect(140,70,80,20);
        g.setColor(Color.WHITE);
        g.fillRect(140,50,80,20);
        g.setColor(Color.RED);
        g.fillRect(140,30,80,20);




    }



}




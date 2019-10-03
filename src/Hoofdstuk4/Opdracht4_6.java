import javax.swing.*;
import java.awt.*;
import java.applet.*;

//een klasse met de naam Show van het type Applet.
public class Opdracht4_6 extends Applet {

    //De betekenis van wat de letters op het scherm zijn + achtergrond kleur.
    public void init() {

        setSize(600, 600);
        setBackground(Color.WHITE);

    }
    public void paint (Graphics g){

    //Het Stoplicht
    g.fillRoundRect(50,70,70,170,25,60);
    g.setColor(Color.RED);
    g.fillOval(65,85,40,40);
    g.setColor(Color.ORANGE);
    g.fillOval(65,135,40,40);
    g.setColor(Color.GREEN);
    g.fillOval(65,185,40,40);

    //De paal van het stoplicht
    g.setColor(Color.DARK_GRAY);
    g.fillRect(80,240,10,280);

    }

}
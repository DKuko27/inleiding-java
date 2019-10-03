import javax.swing.*;
import java.awt.*;
import java.applet.*;

//een klasse met de naam Show van het type Applet.
public class Opdracht4_5 extends Applet {

    //De betekenis van wat de letters op het scherm zijn + achtergrond kleur.
    public void init() {

        setSize(600, 600);
        setBackground(Color.blue);

    }
    public void paint (Graphics g){

        //Cirkel met een taart punt van 45 graden
        g.setColor(Color.YELLOW);
        g.drawArc(20, 20, 100, 50, 360, 360);
        g.fillArc(20,20,100,50,90,45);
    }

}




import javax.swing.*;
import java.awt.*;
import java.applet.*;

//een klasse met de naam Show van het type Applet.
public class opdracht4_7 extends Applet {

    //De betekenis van wat de letters op het scherm zijn + achtergrond kleur.
    public void init() {

        setSize(600, 600);
        setBackground(Color.WHITE);

    }
    public void paint (Graphics g){

        //De Dobbelsteen
        g.drawRoundRect(100,100,100,100,40,40);

        //De 4 puntjes op de steen
        g.fillOval(112,113,30,30);//L Boven
        g.fillOval(158,113,30,30);//R Boven
        g.fillOval(112,157,30,30);//L Onder
        g.fillOval(158,157,30,30);//R Onder

    }

}
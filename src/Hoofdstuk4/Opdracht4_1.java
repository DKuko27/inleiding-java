import java.awt.*;
import java.applet.*;

    //een klasse met de naam Show van het type Applet.
    public class Opdracht4_1 extends Applet {

        //De betekenis van wat de letters op het scherm zijn + achtergrond kleur.
        public void init() {

            setSize(200, 200);

        }

        //De letters op het scherm met de kleuren daarvan.
        public void paint(Graphics g) {

            //gelijkbenige driehoek.
            g.drawLine(70, 120, 120, 120);
            g.drawLine(70, 120, 95, 95);
            g.drawLine(95, 95, 120, 120);


        }

    }











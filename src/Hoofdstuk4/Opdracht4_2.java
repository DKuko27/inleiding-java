import org.omg.CosNaming.BindingIterator;

import java.awt.*;
import java.applet.*;
import java.awt.image.ImageObserver;

//een klasse met de naam Show van het type Applet.
    public class Opdracht4_2 extends Applet {




        //De betekenis van wat de letters op het scherm zijn + achtergrond kleur.
        public void init() {

            setSize(600, 600);



        }

        //De letters op het scherm met de kleuren daarvan.
        public void paint(Graphics g) {

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

        }

    }


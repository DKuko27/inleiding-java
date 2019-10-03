import java.awt.*;
import java.applet.*;

    //een klasse met de naam Show van het type Applet.
    public class opdracht4_3 extends Applet {

        String voornaam;
        String achternaam;

        //De betekenis van wat de letters op het scherm zijn + achtergrond kleur.
        public void init() {


            setSize(200, 200);

        }
            public void paint (Graphics g){


                //Stok van de vlag.
                g.drawLine(140, 170, 140, 90);

                //De vlag zelf.
                g.setColor(Color.BLUE);
                g.fillRect(140, 70, 80, 20);
                g.setColor(Color.WHITE);
                g.fillRect(140, 50, 80, 20);
                g.setColor(Color.RED);
                g.fillRect(140, 30, 80, 20);


            }

        }




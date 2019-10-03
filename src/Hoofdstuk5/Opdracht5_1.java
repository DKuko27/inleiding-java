import java.applet.Applet;
import java.awt.*;

//een klasse met de naam Show van het type Applet.
public class Opdracht5_1 extends Applet {

      Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    //De betekenis van wat de letters op het scherm zijn.
    public void init() {

        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.BLACK;
        breedte = 200;
        hoogte = 100;

        setSize(800,800);

    }

    //Wat op het scherm zichtbaar is.
    public void paint(Graphics g) {

        //Lijn
        g.drawLine(300,80, 100,80);
        g.drawString("Lijn",150,95);

        //Rechthoek
        g.drawRect(100, 100, breedte, hoogte);
        g.drawString("Rechthoek",150,215);

        //Afgeronde Rechthoek
        g.drawRoundRect(100, 225, breedte, hoogte, 30, 30);
        g.drawString("Afgeronde Rechthoek",100,340);

        //Gevulde Rechthoek
        g.setColor(opvulkleur);
        g.fillRect(315, 100, breedte, hoogte);

        //Ovaal
        g.setColor(lijnkleur);
        g.drawOval(315, 100, breedte, hoogte);
        g.drawString("Gevulde rechthoek met ovaal", 315,215);

        //Gevulde Ovaal
        g.setColor(opvulkleur);
        g.fillOval(315, 225, breedte, hoogte);

        g.setColor(lijnkleur);
        g.drawString("Gevulde Ovaal",315,340);



    }
}
import java.applet.Applet;
import java.awt.*;

//een klasse met de naam Show van het type Applet.
public class PraktijkOpdracht4 extends Applet {

    //De betekenis van wat de letters op het scherm zijn.
    public void init() {

        setSize(800,800);

    }

    //Wat op het scherm zichtbaar is.
    public void paint(Graphics g) {

        //Lijn
        g.drawLine(300,80, 100,80);
        g.drawString("Lijn",150,95);

        //Rechthoek
        g.drawRect(100, 100, 200, 100);
        g.drawString("Rechthoek",150,215);

        //Afgeronde Rechthoek
        g.drawRoundRect(100, 225, 200, 100, 30, 30);
        g.drawString("Afgeronde Rechthoek",100,340);

        //Gevulde Rechthoek
        g.setColor(Color.MAGENTA);
        g.fillRect(315, 100, 200, 100);

        //Ovaal
        g.setColor(Color.BLACK);
        g.drawOval(315, 100, 200, 100);
        g.drawString("Gevulde rechthoek met ovaal", 315,215);

        //Gevulde Ovaal
        g.setColor(Color.MAGENTA);
        g.fillOval(315, 225, 200, 100);

        g.setColor(Color.BLACK);
        g.drawString("Gevulde Ovaal",315,340);


        //Helaas niet optijd af kunnen krijgen..
    }
}
import java.applet.Applet;
import java.awt.*;

//een klasse met de naam Show van het type Applet.
public class Opdracht6_1 extends Applet {

    int Totaalbedrag;
    int VerdeelBedrag;

    public void init() {

        Totaalbedrag = 113;
        VerdeelBedrag = 4;

        //Formaat van de pagina.
        setSize(800,800);

    }

    //Wat op het scherm zichtbaar is.
    public void paint(Graphics g) {



        //Lijnen die de namen onderscheiden
        g.drawLine(350,250,180,250);
        g.drawLine(350,280,180,280);
        g.drawLine(350,310,180,310);
        g.drawLine(350,340,180,340);

        //Namen van de personen
        g.drawString("Jan",180, 240);
        g.drawString("Ali",180,270);
        g.drawString("Jeanette",180,300);
        g.drawString("Damir",180,330);

        //Totaal verdiend bedrag
        g.drawString("€"+Totaalbedrag, 300,240);

        //Lijn die de namen van het geld ondersheiden
        g.drawLine(235,340,235,225);

        //Lijn die het totaal bedrag verdeeld met het gedeelde bedrag
        g.drawLine(295,340,295,225);

        //De 4 verdeelde bedragen.
        g.drawString("€"+Totaalbedrag/VerdeelBedrag, 245,240);
        g.drawString("€"+Totaalbedrag/VerdeelBedrag, 245,270);
        g.drawString("€"+Totaalbedrag/VerdeelBedrag, 245,300);
        g.drawString("€"+Totaalbedrag/VerdeelBedrag, 245,330);
    }
}
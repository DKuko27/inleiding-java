package Hoofdstuk8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht8_2 extends Applet {

    Button KnopJongens;
    Button KnopMeisjes;
    Button KnopMannen;
    Button KnopVrouwen;

    int aantalJongens;
    int aantalMeisjes;
    int aantalMannen;
    int aantalVrouwen;
    int totaalAantal;

    public void init() {
        setSize(400, 400);

        KnopJongens = new Button("Jongens");
        KnopJongens.addActionListener(new KnopJongens());
        add(KnopJongens);

        KnopMeisjes = new Button("Meisjes");
        KnopMeisjes.addActionListener(new KnopMeisjes());
        add(KnopMeisjes);

        KnopMannen = new Button("Mannen");
        KnopMannen.addActionListener(new KnopMannen());
        add(KnopMannen);

        KnopVrouwen = new Button("Vrouwen");
        KnopVrouwen.addActionListener(new KnopVrouwen());
        add(KnopVrouwen);

        aantalJongens = 0;
        aantalMeisjes = 0;
        aantalMannen = 0;
        aantalVrouwen = 0;
        totaalAantal = 0;

    }

    public void paint(Graphics g) {

        g.drawString("Aantal Jongens", 90, 100);
        g.drawString("Aantal Meisjes", 90, 130);
        g.drawString("Aantal Mannen", 90, 160);
        g.drawString("Aantal Vrouwen", 90, 190);
        g.drawString("TotaalAantal",90,220);

        //Alle horizontale lijnen.
        g.drawLine(250,110,80,110);
        g.drawLine(250,140,80,140);
        g.drawLine(250,170,80,170);
        g.drawLine(250,200,80,200);
        g.drawLine(250,230,80,230);

        //Verticale lijn.
        g.drawLine(190,230,190,85);


        g.drawString(aantalJongens + "",210,100);
        g.drawString(aantalMeisjes + "",210,130 );
        g.drawString(aantalMannen + "", 210, 160);
        g.drawString(aantalVrouwen + "",210,190);

        g.drawString(totaalAantal + "",210,220);

    }

    class KnopJongens implements ActionListener {


        public void actionPerformed(ActionEvent e) {
            aantalJongens++;
            totaalAantal++;
            repaint();

        }
    }

    class KnopMeisjes implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            aantalMeisjes++;
            totaalAantal++;
            repaint();
        }
    }

    class KnopMannen implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            aantalMannen++;
            totaalAantal++;
            repaint();
        }
    }

    class KnopVrouwen implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            aantalVrouwen++;
            totaalAantal++;
            repaint();

        }
    }
}

package Hoofdstuk10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdracht10 extends Applet {
TextField tekstvak;
int cijfer;
String antwoordTekst;
boolean teHoog;


    public void init(){
        setSize(400,400);

        cijfer = 0;

        tekstvak = new TextField("",20);
        tekstvak.addActionListener(new tekstvakListener());
        add(tekstvak);

    }
    public void paint(Graphics g){
            if (teHoog=true){
                g.drawString(antwoordTekst + "", 50,80);
            }

    }

    public class tekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            cijfer = Integer.parseInt(tekstvak.getText());
            teHoog = false;
            if (cijfer>3) {
                antwoordTekst = "onvoldoende";
            }else {
                antwoordTekst = "slecht";
            }if (cijfer>4) {
                antwoordTekst = "matig";
            }if (cijfer>5) {
                antwoordTekst = "voldoende";
            }else if (cijfer==5) {
                antwoordTekst = "matig";
            }if (cijfer>7) {
                antwoordTekst = "goed";
            }if (cijfer>10) {
                teHoog = true;
                antwoordTekst = "Sorry, maar dat is te hoog. Probeer een ander cijfer.";
            }
            repaint();

        }

    }
}

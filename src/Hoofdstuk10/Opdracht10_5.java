package Hoofdstuk10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht10_5 extends Applet {
    TextField tekstvak;
    Label label;
    Button okKnop;

    String uitslag;
    String welniet;
    double cijfer;
    double totaal;
    int aantal;
    Boolean okGeklikt;

    public void init(){

        cijfer = 0.0;
        uitslag = "";

        okKnop = new Button("Ok");
        okKnop.addActionListener(new OkKnopListener());
        add(okKnop);
        label = new Label("type een cijfer in en druk op enter." + " Zonder decimaal!");
        tekstvak = new TextField("",20);
        tekstvak.addActionListener(new TekstvakListener());
        welniet = "";
        okGeklikt = false;
        //-------------------
        add(label);
        add(tekstvak);

    }

    public void paint(Graphics g){

        g.drawString("cijfer " + cijfer + " is " + uitslag,50,90);
        if (okGeklikt==true){
            g.drawString("gemmid cijfer is" + (totaal/aantal),50,110);
            g.drawString("Student is " + welniet + " geslaagd", 50, 130 );
        }



    }

    public class OkKnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            okGeklikt = true;

        double gemiddelde = totaal/aantal;
        if (gemiddelde<5.5){
            welniet="Niet";
        }else {
            welniet="Wel";
        }
        repaint();

        }
    }

    public class TekstvakListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            okGeklikt = false;
            cijfer = Double.parseDouble(tekstvak.getText());
            if (cijfer<5.5){
                uitslag = "Onvoldoende";
            }else {
                uitslag ="voldoende";

            }
            totaal = totaal+cijfer;
            aantal++;

            repaint();
        }
    }

}

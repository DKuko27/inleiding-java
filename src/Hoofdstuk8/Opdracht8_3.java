package Hoofdstuk8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht8_3 extends Applet {

       Button OkKnop;
    TextField textvak;
    double Som;
    double Cijfer;
    double Antwoord;


    public void init() {


        Cijfer = 0;

        setSize(400,400);
        textvak = new TextField(Cijfer + "",30 );
        double Cijfer = Double.parseDouble(textvak.getText());
        textvak.setEditable(true);
        add(textvak);



        OkKnop = new Button("Ok");
        OkKnop.addActionListener(new OkKnopListener());
        add(OkKnop);

    }

    public void paint(Graphics g){

        g.drawString("Type een bedrag in het vakje en klik op OK.",50,50);

    }

    public class OkKnopListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            double input = Double.parseDouble(textvak.getText());

            Som=input/100;
            Antwoord= Som*21;
            Antwoord = Antwoord+input;
            System.out.println(Antwoord);
            textvak.setText(Antwoord + "");
            repaint();
        }
    }
}


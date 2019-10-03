package Hoofdstuk8;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht8_1 extends Applet {
    TextField tekstvak;
    Button okknop;
    Button resetknop;


    public void init() {
        tekstvak = new TextField("", 30);
        okknop = new Button("Ok");
        okknop.addActionListener( new KnopListener() );
        add(tekstvak);
        add(okknop);

        resetknop = new Button("Reset");
        resetknop.addActionListener( new resetknopListener() );
        add(tekstvak);
        add(resetknop);
    }

    public void paint(Graphics g) {
        g.drawString("Type iets in het tekst vakje " +
                "en klik op Ok", 50, 60 );
    }

    class KnopListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            tekstvak.setText("Jammer, " +
                    "probeer volgende keer beter");
            repaint();
        }
    }
    class resetknopListener implements ActionListener {
       public void actionPerformed( ActionEvent e) {
           tekstvak.setText("  ");
           repaint();

       }


    }
}
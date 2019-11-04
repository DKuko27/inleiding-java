package Hoofdstuk12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht12_4 extends Applet implements ActionListener {

    TextField tf;
    Button knop;
    Boolean gevonden;
    int index;

    int[] getallen = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};

    public void init(){

        tf = new TextField(10);
        add(tf);

        knop = new Button("Ok");
        knop.addActionListener(this);
        add(knop);

        gevonden = false;

    }

    public void paint(Graphics g){
        if (gevonden) {
            g.drawString("De waarde is gevonden op index " + index, 50,80);
        }else {
            g.drawString("De waarde is niet gevonden.",50,80);
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        gevonden = false;
        int input = Integer.parseInt(tf.getText());

        for (int i = 0; i<getallen.length; i++) {
            if (getallen[i] == input) {
                gevonden = true;
                index = i;
            }

        }
        repaint();

    }
}

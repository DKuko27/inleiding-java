package Hoofdstuk12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Opdracht12_3 extends Applet {

    TextField[] velden;
    Button knop;


    public void init(){
        setSize(600,600);

        velden = new TextField[5];
        for (int i = 0; i < 5; i++) {

            TextField tf = new TextField(10);
            add(tf);
            velden[i] = tf;

        }

        knop = new Button("Ok");
        knop.addActionListener(new knopListener());
        add(knop);

    }

    public void paint(Graphics g){

    }


    public class knopListener implements ActionListener{
        public void actionPerformed(ActionEvent e){

            int[] getallen = new int[5];
            for (int i = 0; i < velden.length; i++) {
                String in = velden[i].getText();
                int input = Integer.parseInt(in);
                getallen[i] = input;
            }
            Arrays.sort(getallen);
            for (int i = 0; i < velden.length; i++) {
                velden[i].setText("" + getallen[i]);
            }


        }
    }

}

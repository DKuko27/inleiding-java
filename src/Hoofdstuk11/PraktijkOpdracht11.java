package Hoofdstuk11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdracht11 extends Applet{

    Button knop;
    TextField tekstvak;
    String s;
    int eerstegetal;
    int x;

    public void init(){
        setSize(600,1000);

        knop = new Button("Bereken");
        knop.addActionListener(new knopListener());
        add(knop);

        tekstvak = new TextField(20);
        tekstvak.addActionListener(new tekstvakListener());
        add(tekstvak);

        s="";

    }

    public void paint(Graphics g){
        for (int i = 0;i < 11; i++){
            g.drawString("" + x, 20,50+i*15);
            x=0;
            x= eerstegetal*i;

        }


    }

    public class knopListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            s = tekstvak.getText();
            eerstegetal = Integer.parseInt(s);
            repaint();

        }
    }

    public class tekstvakListener implements ActionListener{
        public void actionPerformed(ActionEvent e){

        }
    }

}
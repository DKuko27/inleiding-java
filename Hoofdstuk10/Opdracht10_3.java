package Hoofdstuk10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht10_3 extends Applet {

    int maand;
    TextField tekstvak;
    String s, tekst;


    public void init(){
        setSize(400,400);

        tekstvak = new TextField(20);
        tekstvak.addActionListener(new tekstvakActionListener());
        add(tekstvak);

    }

    public void paint(Graphics g){

        g.drawString(tekst,50,80);


    }

    public class tekstvakActionListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            String userInputString = tekstvak.getText();
            maand = Integer.parseInt(userInputString);
            switch(maand) {
                case 1:
                    tekst = "Januari heeft 31 dagen";
                    break;
                case 2:
                    tekst = "Februari heeft 28 dagen";
                    break;
                case 3:
                    tekst = "Maart heeft 31 dagen";
                    break;
                case 4:
                    tekst = "April heeft 30 dagen";
                    break;
                case 5:
                    tekst = "Mei heeft 31 dagen";
                    break;
                case 6:
                    tekst = "Juni heeft 30 dagen";
                    break;
                case 7:
                    tekst = "Juli heeft 31 dagen";
                    break;
                case 8:
                    tekst = "Augustus heeft 30 dagen";
                    break;
                case 9:
                    tekst = "September heeft 31 dagen";
                    break;
                case 10:
                    tekst = "Oktober heeft 30 dagen";
                    break;
                case 11:
                    tekst = "November heeft 31 dagen";
                    break;
                case 12:
                    tekst = "December heeft 30 dagen";
                    break;



            }
            repaint();

        }
    }

}

package Hoofdstuk10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht10_4 extends Applet {

    int maand;
    int jaar;
    TextField tekstvakMaand, tekstvakJaar;
    String  j, tekst, tekst2;


    public void init(){
        setSize(400,400);

        tekstvakMaand = new TextField(20);
        tekstvakMaand.addActionListener(new tekstvakActionListener());
        add(tekstvakMaand);

        tekstvakJaar = new TextField(20);
        tekstvakJaar.addActionListener(new tekstvakActionListener());
        add(tekstvakJaar);

    }

    public void paint(Graphics g){

        g.drawString("Maand:", 30, 50);
        g.drawString("Jaar:",200,50);

        g.drawString(tekst,50,100);
        g.drawString(tekst2,50,120);

    }

    public class tekstvakActionListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            j = tekstvakMaand.getText();
            String userInputString = tekstvakMaand.getText();
            maand = Integer.parseInt(userInputString);

            j = tekstvakJaar.getText();
            String userInputString2 = tekstvakJaar.getText();
            jaar = Integer.parseInt(userInputString2);

            if ((jaar % 4 == 0 && !(jaar % 100 == 0))) {
                tekst2 = "" + jaar + " is een schrikkeljaar";
            }
            else {
                tekst2 = "" + jaar + " is geen schrikkel jaar";
            }
            repaint();


            switch(maand) {
                case 1:
                    tekst = "Januari heeft 31 dagen";
                    break;
                case 2:
                    if ((jaar % 4 == 0 && !(jaar % 100 == 0))) {
                        tekst = "Februari heeft 29 dagen.";
                    }
                    else {
                        tekst = "Februari heeft 28 dagen.";
                    }
                    repaint();
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

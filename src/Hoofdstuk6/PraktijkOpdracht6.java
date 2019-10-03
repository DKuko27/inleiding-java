package Hoofdstuk6;

import java.applet.Applet;
import java.awt.*;

public class PraktijkOpdracht6 extends Applet {

    double Cijfer1;
    double Cijfer2;
    double Cijfer3;
    double UitkomstCijfers;
    int Antwoord;

    public void init(){

        Cijfer1 = 5.9;
        Cijfer2 = 6.3;
        Cijfer3 = 6.9;
        UitkomstCijfers = Cijfer1 + Cijfer2 + Cijfer3;
        UitkomstCijfers = UitkomstCijfers/3;
        UitkomstCijfers *= 10.0;
        int Antwoord = (int) UitkomstCijfers;
        UitkomstCijfers = Antwoord;
        UitkomstCijfers = UitkomstCijfers/10;




        setSize(800,800);
        setBackground(Color.BLACK);

    }

   public void paint(Graphics g){

        g.setColor(Color.WHITE);
        g.drawString("Het gemiddelde is  " + UitkomstCijfers + " van de 3 cijfers.",20,20);

   }

}





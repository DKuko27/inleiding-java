package Hoofdstuk6;

import java.applet.Applet;
import java.awt.*;

public class Opdracht6_3 extends Applet {

    int hour = 2147483647 + 1;

    public void init(){

    setSize(800,800);
    setBackground(Color.BLACK);

   }

   public void paint(Graphics g){

        g.setColor(Color.WHITE);
       g.drawString("De uitkomst is: " + hour, 20, 20);

   }

}

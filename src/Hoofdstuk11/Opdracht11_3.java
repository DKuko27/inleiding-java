package Hoofdstuk11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht11_3 extends Applet {
    public void init() {
        setSize(800,800);
        setBackground(Color.BLACK);
    }

    public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        int y = 0;
        int arg1 = 0;
        int arg2 = 1;
        int som = arg1 + arg2;


       for(int teller=0; teller<20; teller++){
           y += 20;
           g.drawString(som + "",50,y);
           arg1 = arg2;
           arg2 = som;
           som = arg1 + arg2;
       }

    }
}

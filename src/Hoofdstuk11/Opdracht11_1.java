package Hoofdstuk11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht11_1 extends Applet {

    public void init(){
        setSize(800,800);
        setBackground(Color.BLACK);
    }
    public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        int teller;
        int x = 0;

        for (teller = 0; teller < 10; teller++) {
            x += 20;
            g.drawLine(x, 110, x, 10);
        }



    }
}


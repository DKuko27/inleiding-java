package Hoofdstuk11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht11_5 extends Applet {
    public void init(){;
    setSize(400,400);
    setBackground(Color.BLACK);


    }
    public void paint(Graphics g){
        g.setColor(Color.WHITE);
        int y = 0;
        int x = 20;

        while(y<200) {
            y +=40;
            x +=40;
            g.drawRect(x,y,40,40);
        }

    }
}

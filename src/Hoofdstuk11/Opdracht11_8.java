package Hoofdstuk11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht11_8 extends Applet {
    public void init(){
        setSize(1000,1000);
    }
    public void paint(Graphics g){
        int y = 0;
        int x = 0;

        while(y<1000) {
            y +=10;
            x +=10;
            g.drawOval(10,10,x,y);
        }

    }
}

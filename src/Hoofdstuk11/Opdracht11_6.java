package Hoofdstuk11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht11_6 extends Applet {
    public void init(){
         setSize(400,400);


    }
    public void paint(Graphics g){

        int x = 200;
        int y = 200;
        int delta = 10;

        while(x<205){
            x-=delta/2;
            y-=delta/2;
            g.drawOval(x,y,20,20);
        }

    }
}

package Hoofdstuk13;

import java.applet.Applet;
import java.awt.*;

public class Opdracht13_1 extends Applet {

    public void init(){

        setBackground(Color.BLACK);
        setSize(800,800);

    }

    public void paint(Graphics g){

        g.setColor(Color.WHITE);
        tekenDriehoek(g, 200,200,100,400,300,400);

    }

    void tekenDriehoek( Graphics g, int x1, int y1, int x2, int y2, int x3, int y3) {

        g.drawLine(x1, y1, x2, y2);
        g.drawLine(x2, y2, x3, y3);
        g.drawLine(x3, y3, x1, y1);

    }
  }


package Hoofdstuk13;

import java.awt.*;
import java.applet.*;

public class PraktijkOpdracht13_1 extends Applet{
    public void init(){
        setSize(800,800);
    }

    public void paint(Graphics g){

        tekenBoom(g, 200, 200);

    }

    void tekenBoom(Graphics g, int x, int y){

        //De boomstam.
        g.setColor(new Color(125, 75, 20));
        g.fillRect(x, y, 50, 250);

        //Blaadjes van de boom.
        g.setColor(Color.GREEN);
        g.fillArc(x -80, y -100, 140, 100, 0, 360);
        g.fillArc(x -10, y -150, 140, 100, 0, 360);
        g.fillArc(x -80, y -50, 140, 100, 0, 360);
        g.fillArc(x -10, y -100, 140, 100, 0, 360);
        g.fillArc(x -10, y -50, 140, 100, 0, 360);

        //Gat in boom.
        g.setColor(Color.BLACK);
        g.fillOval(220,290,20,25);

    }
}
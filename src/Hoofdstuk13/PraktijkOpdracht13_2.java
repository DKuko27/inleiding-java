package Hoofdstuk13;

import java.awt.*;
import java.applet.*;

public class PraktijkOpdracht13_2 extends Applet{
    public void init(){
        setSize(1920,1080);
    }

    int x = 80;
    int y = 80;
    int x2 = 80;
    int y2 = 300;
    int breedteBoom = 40;
    int hoogteBoom = 120;
    int breedteBlad = 100;
    int hoogteBlad = 100;

    public void paint(Graphics g){

        for (int i = 0; i < 11; i++) {
            tekenBoom(g, x, y);
            x += breedteBoom;
            x += breedteBlad;
            for (int f = 0; f < 3; f++) {
                tekenBoom(g, x, y);

            }

        }

        for (int j = 0; j < 11; j++) {
            tekenBoom(g, x2, y2);
            x2 += breedteBoom;
            x2 += breedteBlad;

            for (int a = 0; a < 3; a++) {
                tekenBoom(g, x2, y2);

            }

        }

    }

    void tekenBoom(Graphics g, int x, int y){

        g.setColor(new Color(125, 70, 20));
        g.fillRect(x, y, breedteBoom, hoogteBoom);
        g.setColor(Color.green);
        g.fillArc(x - 30, y - 40, breedteBlad, hoogteBlad, 0, 360);

    }
}
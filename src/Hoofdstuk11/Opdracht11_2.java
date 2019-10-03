package Hoofdstuk11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht11_2 extends Applet {
    public void init() {
        setSize(800,800);
        setBackground(Color.BLACK);
    }

    public void paint(Graphics g) {
        g.setColor(Color.WHITE);

        int nummer;
        int y = 0;

        for (nummer = 20; nummer > 9; nummer--) {
            y += 20;
            g.drawString("" + nummer, 30, y);


        }
    }
}

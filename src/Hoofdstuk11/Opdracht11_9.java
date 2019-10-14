package Hoofdstuk11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht11_9 extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {

        int breedte = 50;
        int hoogte = 50;

        int x = 50;
        int y = 50;

        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.WHITE);
                g.fillRect(x, y, breedte, hoogte);
            }
            x += breedte;
        }

        x = 100;
        y = 100;

        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 6 || kolom == 4 || kolom == 2 || kolom == 0) {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.WHITE);
                g.fillRect(x, y, breedte, hoogte);
            }
            x += breedte;
        }
        x = 50;
        y = 150;

        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.WHITE);
                g.fillRect(x, y, breedte, hoogte);
            }
            x += breedte;
        }
        x = 100;
        y = 200;

        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.WHITE);
                g.fillRect(x, y, breedte, hoogte);
            }
            x += breedte;
        }
        x = 50;
        y = 250;

        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.WHITE);
                g.fillRect(x, y, breedte, hoogte);
            }
            x += breedte;
        }
        x = 100;
        y = 300;

        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.WHITE);
                g.fillRect(x, y, breedte, hoogte);
            }
            x += breedte;
        }
        x = 50;
        y = 350;

        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.WHITE);
                g.fillRect(x, y, breedte, hoogte);
            }
            x += breedte;
        }
        x = 100;
        y = 400;

        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.WHITE);
                g.fillRect(x, y, breedte, hoogte);
            }
            x += breedte;
        }
    }
}

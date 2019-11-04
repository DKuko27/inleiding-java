package Hoofdstuk12;

import java.applet.Applet;
import java.awt.*;
import java.text.AttributedCharacterIterator;

public class Opdracht12_1 extends Applet{
    int[] getallen = {10,5,15,25,55,20,10,10,50,40};
    double gemmidelde;

    public void init(){
        int totaal = 0;
        int aantal = 0;

        for (int i = 0; i < getallen.length; i++){
            int getal = getallen[i];
            totaal = totaal + getal;
            aantal++;

            gemmidelde = totaal/aantal;

        }

    }
    public void paint(Graphics g){

        g.drawString("Het gemmidelde is " + gemmidelde, 100,100);
        g.drawString("Aantal getallenn op het Scherm " + getallen.length,100,20);

        g.drawString("10, 5, 15, 25, 55, 20, 10, 10, 50, 40 ",100,50);

    }
}
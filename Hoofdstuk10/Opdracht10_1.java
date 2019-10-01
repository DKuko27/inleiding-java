package Hoofdstuk10;

import com.sun.deploy.security.SelectableSecurityManager;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht10_1 extends Applet {

    TextField tekstvak;
    boolean firstNumber;
    int maxInput;
    int minInput;
    int userInput;
    String sorry;

    public void init(){
        setSize(400,400);

        tekstvak = new TextField(20);
        tekstvak.addActionListener(new tekstListener());
        add(tekstvak);
        maxInput = 0;
        minInput = 0;
        firstNumber = true;
        sorry = "";

    }

    public void paint(Graphics g){

     g.drawString("Max Input:" + maxInput, 50,100);
     g.drawString("Min Input:" + minInput,50,130);
     g.drawString(sorry,50,160);

    }

    public class tekstListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            String userInputString = tekstvak.getText();
            userInput = Integer.parseInt(userInputString);
            if (firstNumber) {
                firstNumber = false;
                maxInput = userInput;
                minInput = userInput;
                repaint();
            } else {
                if (userInput > maxInput); {
                    maxInput = userInput;
                    sorry = "";
                    repaint();
                } if (userInput < minInput) {
                    minInput = userInput;
                    sorry = "";
                    repaint();
                } else {
                    sorry = "Sorry, maar " + minInput + " is niet hoger dan " + userInput;
                    repaint();
                }

            }

        }
    }

}

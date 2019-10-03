package Hoofdstuk8;

import com.sun.javafx.tk.TKPulseListener;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht8 extends Applet {

    TextField eersteVeld;
    TextField tweedeVeld;
    Button keer;
    Button delen;
    Button plus;
    Button min;
    int uitkomst;

    public void init(){

        setSize(600,600);

        uitkomst = 0;

        eersteVeld = new TextField("",10);
        add(eersteVeld);

        tweedeVeld = new TextField("",10);
        add(tweedeVeld);

        keer = new Button("*");
        keer.addActionListener(new KeerListener());
        add(keer);

        delen = new Button("/");
        delen.addActionListener(new KeerListener());
        add(delen);

        plus = new Button("+");
        plus.addActionListener(new PlusListener());
        add(plus);

        min = new Button("-");
        min.addActionListener(new MinListener());
        add(min);


    }

    public void paint(Graphics g){



    }

    public class KeerListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            String s= eersteVeld.getText();
            int input = Integer.parseInt(s);
            int input2 = Integer.parseInt(tweedeVeld.getText());
            int uitkomst = input * input2;
            eersteVeld.setText("" + uitkomst);
            tweedeVeld.setText("");

        }
    }

    public class DelenListener implements ActionListener {

        public void actionPerformed(ActionEvent e){
            String s = eersteVeld.getText();
            int input = Integer.parseInt(s);
            int input2 = Integer.parseInt(tweedeVeld.getText());
            int uitkomst = input / input2;
            eersteVeld.setText("" + uitkomst);
            tweedeVeld.setText("");

        }
    }

    public class PlusListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String s = eersteVeld.getText();
            int input = Integer.parseInt(s);
            int input2 = Integer.parseInt(tweedeVeld.getText());
            int uitkomst = input + input2;
            eersteVeld.setText("" + uitkomst);
            tweedeVeld.setText("");

        }
    }

    public class MinListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String s = eersteVeld.getText();
            int input = Integer.parseInt(s);
            int input2 = Integer.parseInt(eersteVeld.getText());
            int uitkomst = input - input2;
            eersteVeld.setText("" + uitkomst);
            tweedeVeld.setText("");

        }
    }

}
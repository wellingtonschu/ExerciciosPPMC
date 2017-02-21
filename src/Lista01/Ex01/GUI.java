package Lista01.Ex01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by lucas on 18/02/17.
 */
public class GUI {


    Contador c1;
    Contador c2;
    JLabel jlA;
    JLabel jlB;
    JButton startA;
    JButton pauseA;
    JButton stopA;
    JButton startB;
    JButton pauseB;
    JButton stopB;
    public GUI() {

        preparaAmbiente();

        c1 = new Contador(jlA);
        Thread t = new Thread(c1, "thread 1");
        t.start();

        c2 = new Contador(jlB);
        Thread t2 = new Thread(c2, "thread 2");
        t2.start();
    }

    public static void main(String[] args) {

        new GUI();

    }

    public void preparaAmbiente() {

        jlA = new JLabel("0");
        jlB = new JLabel("0");

        startA = new JButton("Start A");
        pauseA = new JButton("Pause A");
        stopA = new JButton("Stop A");

        startB = new JButton("Start B");
        pauseB = new JButton("Pause B");
        stopB = new JButton("Stop B");

        JFrame fr = new JFrame("Contador");

        fr.setLayout(new FlowLayout());
        fr.add(startA);
        fr.add(pauseA);
        fr.add(stopA);
        fr.add(jlA);

        fr.add(startB);
        fr.add(pauseB);
        fr.add(stopB);
        fr.add(jlB);

        fr.setSize(300, 120);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        startA.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub

                c1.comecar();

            }
        });

        pauseA.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub

                c1.pausar();

            }
        });

        stopA.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub

                c1.parar();

            }
        });

        startB.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub

                c2.comecar();

            }
        });

        pauseB.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub

                c2.pausar();

            }
        });

        stopB.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub

                c2.parar();

            }
        });

    }

}


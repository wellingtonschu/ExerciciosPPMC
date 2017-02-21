package Lista01.Ex01;

import javax.swing.*;

/**
 * Created by lucas on 18/02/17.
 */
    public class Contador implements Runnable {

        boolean pausado = true;
        int contador = 0;
        JLabel Jl;

        public Contador(JLabel Jl) {
            this.Jl = Jl;
        }

        public void comecar() {
            pausado = false;
            synchronized (this) {
                notify();
            }

        }

        public void pausar() {
            pausado = true;
        }

        public void parar() {
            pausar();
            contador = 0;
            Jl.setText("0");
        }

        @Override
        public void run() {
            while (true) {
                if (pausado) {
                    try {
                        synchronized (this) {
                            wait();
                        }
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                } else {
                    ++contador;
                    Jl.setText(Integer.toString(contador));
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        // TODO: handle exception
                    }
                }
            }
        }

    }

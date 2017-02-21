package Lista01.Ex02;

import java.util.concurrent.Semaphore;

public class SemaforoThread {

    static Semaphore semaphore = new Semaphore(1);

    public static void main(String[] args) {

        Thread thread1 = new Thread() {

            @Override
            public void run() {
                while (true) {
                    try {
                        semaphore.acquire();
                        System.out.println("semaforo 1 aberto");
                        Thread.sleep(3000);
                        semaphore.release();
                        System.out.println("semaforo 1 fechado");
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };


        Thread thread2 = new Thread() {


            @Override
            public void run() {
                while (true) {
                    try {
                        semaphore.acquire();
                        System.out.println("semaforo 2 aberto");
                        Thread.sleep(3000);
                        semaphore.release();
                        System.out.println("semaforo 2 fechado");
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Thread thread3 = new Thread() {


            @Override
            public void run() {
                while (true) {
                    try {
                        semaphore.acquire();
                        System.out.println("semaforo 3 aberto");
                        Thread.sleep(3000);
                        semaphore.release();
                        System.out.println("semaforo 3 fechado");
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Thread thread4 = new Thread() {


            @Override
            public void run() {
                while (true) {
                    try {
                        semaphore.acquire();
                        System.out.println("semaforo 4 aberto");
                        Thread.sleep(3000);
                        semaphore.release();
                        System.out.println("semaforo 4 fechado");
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };


        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();


    }
}
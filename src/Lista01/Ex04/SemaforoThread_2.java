package Lista01.Ex04;

import java.util.concurrent.Semaphore;

public class SemaforoThread_2 {

    static Semaphore semaphoreFrente = new Semaphore(1);
    static Semaphore semaphoreDireita = new Semaphore(1);

    public static void main(String[] args) {


        Thread thread1 = new Thread() {

            @Override
            public void run() {
                while (true) {
                    try {
                        semaphoreFrente.acquire();
                        System.out.println("semaforo 1 aberto");
                        Thread.sleep(3000);
                        semaphoreFrente.release();
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
                        semaphoreFrente.acquire();
                        System.out.println("semaforo 2 aberto");
                        Thread.sleep(3000);
                        semaphoreFrente.release();
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
                        semaphoreFrente.acquire();
                        System.out.println("semaforo 3 aberto");
                        Thread.sleep(3000);
                        semaphoreFrente.release();
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
                        semaphoreFrente.acquire();
                        System.out.println("semaforo 4 aberto");
                        Thread.sleep(3000);
                        semaphoreFrente.release();
                        System.out.println("semaforo 4 fechado");
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Thread thread4direita = new Thread() {


            @Override
            public void run() {
                while (true) {
                    try {
                        semaphoreDireita.acquire();
                        System.out.println("semaforo 1 direita aberto");
                        Thread.sleep(3000);
                        semaphoreDireita.release();
                        System.out.println("semaforo 1 direita fechado");
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Thread thread1direita = new Thread() {


            @Override
            public void run() {
                while (true) {
                    try {
                        semaphoreDireita.acquire();
                        System.out.println("semaforo 2 direita aberto");
                        Thread.sleep(3000);
                        semaphoreDireita.release();
                        System.out.println("semaforo 2 direita fechado");
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Thread thread2direita = new Thread() {


            @Override
            public void run() {
                while (true) {
                    try {
                        semaphoreDireita.acquire();
                        System.out.println("semaforo 3 direita aberto");
                        Thread.sleep(3000);
                        semaphoreDireita.release();
                        System.out.println("semaforo 3 direita fechado");
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Thread thread3direita = new Thread() {


            @Override
            public void run() {
                while (true) {
                    try {
                        semaphoreDireita.acquire();
                        System.out.println("semaforo 4 direita aberto");
                        Thread.sleep(3000);
                        semaphoreDireita.release();
                        System.out.println("semaforo 4 direita fechado");
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };


        thread1.start();
        thread1direita.start();

        thread2.start();
        thread2direita.start();

        thread3.start();
        thread3direita.start();

        thread4.start();
        thread4direita.start();


    }
}

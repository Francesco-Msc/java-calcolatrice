package org.lessons.java.utils;

public class CalcoliHelper {

    //Applico l'overloading ovvero piu metodi con lo stesso nome ma con funzionalità o parametri diversi

    public static int somma (int a, int b){
        return a + b;
    }

    public static double somma (double a, double b){
        return a + b;
    }

    public static int differenza (int a, int b){
        return a - b;
    }

    public static double differenza (double a, double b){
        return a - b;
    }

    public static int moltiplicazione (int a, int b){
        return a * b;
    }

    public static double moltiplicazione (double a, double b){
        return a * b;
    }

    public static int assoluto (int a){
        if(a < 0){
            return -a;
        } else {
            return a;
        }
    }

    public static double assoluto (double a){
        if(a < 0){
            return -a;
        } else {
            return a;
        }
    }

    public static int minimo (int a, int b){
        if(a < b){
            return a;
        } else {
            return b;
        }
    }

    public static double minimo (double a, double b){
        if(a < b){
            return a;
        } else {
            return b;
        }
    }

    public static int massimo (int a, int b){
        if(a > b){
            return a;
        } else {
            return b;
        }
    }

    public static double massimo (double a, double b){
        if(a > b){
            return a;
        } else {
            return b;
        }
    }

    //Bonus
    
    public static int potenza (int base, int esponente){

        if (base == 0 || esponente == 0) {
            return 1;
        }

        int b = Math.abs(base);
        int e = Math.abs(esponente);

        return (int) Math.pow(b, e);
    }
}

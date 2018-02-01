package com.courseJava;

public class Fracciones {
    private int num;
    private int den;

    public Fracciones(){
        num = 0;
        den = 1;
    }

    public Fracciones(int x, int y){
        num = x;
        den = y;
    }

    public static Fracciones sumar(Fracciones a, Fracciones b){
        Fracciones c = new Fracciones();
        c.num = a.num * b.den + b.num * a.den;
        c.den = a.den * b.den;
        return c;
    }

    public static Fracciones restar(Fracciones a, Fracciones b){
        Fracciones c = new Fracciones();
        c.num = a.num * b.den - b.num * a.den;
        c.den = a.den * b.den;
        return c;
    }

    public static Fracciones multiplicar(Fracciones a, Fracciones b){
        return new Fracciones(a.num * b.num, a.den * b.den);
    }
    public static Fracciones inversa(Fracciones a){
        return new Fracciones(a.den, a.num);
    }

    public static Fracciones dividir(Fracciones a, Fracciones b){
        return multiplicar(a, inversa(b));
    }

    private int mcd(){
        int u=Math.abs(num);
        int v=Math.abs(den);
        if(v==0){
            return u;
        }
        int r;
        while(v!=0){
            r=u%v;
            u=v;
            v=r;
        }
        return u;
    }

    public Fracciones simplificar(){
        int dividir=mcd();
        num/=dividir;
        den/=dividir;
        return this;
    }

    public String toString(){
        String texto=num+" / "+den;
        return texto;
    }
}

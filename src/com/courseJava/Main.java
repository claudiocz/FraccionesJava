package com.courseJava;

public class Main {

    static public void main(String[] args) {
        Fracciones x=new Fracciones(2,3);
        Fracciones y=new Fracciones(4,3);
        Fracciones z=new Fracciones(1,2);
        System.out.println("x--> "+x);
        System.out.println("y--> "+y);
        System.out.println("z--> "+z);
        System.out.println("x+y= "+Fracciones.sumar(x, y));
        System.out.println("x*y= "+Fracciones.multiplicar(x,y));
        //primero suma x e y y luego hace el producto con z
        Fracciones resultado=Fracciones.multiplicar(Fracciones.sumar(x,y),z);
        System.out.println("(x+y)*z= "+resultado);
        System.out.println(resultado.simplificar());

        try  {
        //espera la pulsación de una tecla y luego RETORNO
            System.in.read();
        }catch (Exception e) {  }
    }
}

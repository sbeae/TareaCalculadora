package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SistemaDeEcuaciones {

    public static double ingresarA(double a){
        Scanner A=new Scanner(System.in);
        System.out.println("Ingrese la variable a: ");
        a = Double.parseDouble(A.nextLine());
        return a;
    }
    public static double ingresarB(double b){
        Scanner A=new Scanner(System.in);
        System.out.println("Ingrese la variable b: ");
        b = Double.parseDouble(A.nextLine());
        return b;
    }
    public static double ingresarC(double c){
        Scanner A=new Scanner(System.in);
        System.out.println("Ingrese la variable c: ");
        c = Double.parseDouble(A.nextLine());
        return c;
    }
    public static double ingresarD(double d){
        Scanner D=new Scanner(System.in);
        System.out.println("Ingrese la variable d: ");
        d = Double.parseDouble(D.nextLine());
        return d;
    }
    public static double ingresarE(double e){
        Scanner E=new Scanner(System.in);
        System.out.println("Ingrese la variable e: ");
        e = Double.parseDouble(E.nextLine());
        return e;
    }
    public static double ingresarF(double f){
        Scanner F=new Scanner(System.in);
        System.out.println("Ingrese la variable f: ");
        f = Double.parseDouble(F.nextLine());
        return f;
    }
    public static double calculoDeterminante(double a, double b, double c, double d, double e, double f, double determinante){
        determinante = a * e - b * d;
        if (determinante != 0) {
            return determinante;
        }
        else {
            System.out.println("El sistema de ecuaciones no tiene solución única.");
        }


        return determinante;
    }
    public static double calculoSolucion1(double b, double c, double e, double f, double determinante){
        double x = (c * e - b * f) / determinante;

        return x;

    }
    public static double calculoSolucion2(double a, double f, double c, double d, double determinante){
        double y = (a * f - c * d) / determinante;
        return y;
    }

    public static void mostrar(double x, double y){
        System.out.println("x= "+x);
        System.out.println("y= "+y);
    }
}

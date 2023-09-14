package org.example;

import java.util.Scanner;

public class Cuadratica {
    public static void main(String[] args) {

        }

    public static double ingresarA(double a){
        Scanner A=new Scanner(System.in);
        System.out.println("Ingrese la variable a: ");
        a = Double.parseDouble(A.nextLine());
        return a;
    }
    public static double ingresarB(double b){
        Scanner B=new Scanner(System.in);
        System.out.println("Ingrese la variable b: ");
        b = Double.parseDouble(B.nextLine());
        return b;
    }
    public static double ingresarC(double c){
        Scanner C=new Scanner(System.in);
        System.out.println("Ingrese la variable c: ");
        c = Double.parseDouble(C.nextLine());
        return c;
    }
    public static double cuadratica(double a, double b, double c){
        double discriminante = b * b - 4 * a * c;
        if(discriminante < 0){
            System.out.println("El discriminante es menor que 0, por lo cual la ecuacion no tiene soluciones en los reales.");
        }
        else if(discriminante == 0){
            System.out.println("El discriminante es igual a 0, por lo cual la ecuacion tiene 1 solucion en los reales.");
        }
        else if(discriminante > 0){
            System.out.println("El discriminante es mayor que 0, por lo cual la ecuacion tiene 2 soluciones en los reales.");
        }
    return discriminante;

    }
    public static double calcularCuadratica1(double x1, double a, double b, double c, double discriminante){
        x1=(-b + Math.sqrt(discriminante)) / (2 * a);
        return x1;
    }
    public static double calcularCuadratica2(double x2, double a, double b, double c, double discriminante){
        x2=(-b - Math.sqrt(discriminante)) / (2 * a);
        return x2;
    }
    public static void mostrarResultados(double x1, double x2){
    System.out.println("La primera raiz de la ecuacion es: " + x1);
    System.out.println("La segunda raiz de la ecuacion es: " + x2);
    }

}
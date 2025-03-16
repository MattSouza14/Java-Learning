package Exercicios.ExerciciosClasse.util;

public class Circulo {
    double area;
    double b;
    double c;
    public Circulo(double b, double c){
        this.b = b;
        this.c = c;
    }

    public double CalcularAreaC(){

        area = 3.14 * (b * b);
        return  area;
    }
}

package Exercicios.ExerciciosClasse.util;

public class Quadrado {
    double b;
    double area;

    public Quadrado(double b){
        this.b = b;
    }

    public double CalcularAreaQ(){
        area = b * b;
        return area;
    }


}

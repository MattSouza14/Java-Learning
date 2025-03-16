package Exercicios.ExerciciosClasse.util;

public class Retangulo  {
   double area;
   double b;
   double c;
    public Retangulo(double b, double c) {
        this.b = b;
        this.c = c;
    }

    public double CalcularAreaR(){
        area = (b * c) / 2;
        return  area;
    }

}

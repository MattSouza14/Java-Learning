package Exercicios.ExerciciosClasse.util.ExercClasse2;

public class CalculadoraCientifica extends Calculadora{
    public CalculadoraCientifica(double numero1, double numero2) {
        super(numero1, numero2);
    }

    public double potencia() {
        return Math.pow(getNumero1(), getNumero2());
    }

    public double raizQuadrada() {
        if (getNumero1() < 0) {
            throw new ArithmeticException("Numero negativo não tem raiz");
        }
        return Math.sqrt(getNumero1());
    }

}

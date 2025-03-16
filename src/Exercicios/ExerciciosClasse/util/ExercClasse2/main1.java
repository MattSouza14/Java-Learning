package Exercicios.ExerciciosClasse.util.ExercClasse2;

public class main1 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora(4, 7);
        System.out.println("Soma: " +  calculadora.somar());
        System.out.println("Subtração: " + calculadora.subtrair());
        System.out.println("Multiplicação: " + calculadora.multiplicar());
        System.out.println("Divisão: " + calculadora.dividir());

        CalculadoraCientifica cientifica = new CalculadoraCientifica(2, 3);
        System.out.println("Potência: " + cientifica.potencia());
        System.out.println("Raiz Quadrada: " + cientifica.raizQuadrada());

        CalculadoraFinanceira financeira = new CalculadoraFinanceira(1000, 0, 5, 2);
        System.out.println("Juros Simples: " + financeira.calcularJurosSimples());
        System.out.println("Juros Compostos: " + financeira.calcularJurosCompostos());
    }
}

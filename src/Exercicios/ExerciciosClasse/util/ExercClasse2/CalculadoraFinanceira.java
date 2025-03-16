package Exercicios.ExerciciosClasse.util.ExercClasse2;

public class CalculadoraFinanceira extends Calculadora{
    private double taxa;
    private double tempo;

    public CalculadoraFinanceira(double numero1, double numero2, double taxa, double tempo) {
        super(numero1, numero2);
        this.taxa = taxa;
        this.tempo = tempo;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public double getTempo() {
        return tempo;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }

    public double calcularJurosSimples() {
        return getNumero1() * (taxa / 100) * tempo;
    }

    public double calcularJurosCompostos() {
        return getNumero1() * Math.pow((1 + taxa / 100), tempo) - getNumero1();
    }
}

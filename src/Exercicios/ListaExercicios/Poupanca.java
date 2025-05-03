package Exercicios.ListaExercicios;

public class Poupanca extends Conta {
    private int diaRendimento;

    public Poupanca() {
        super();
        this.diaRendimento = 1;
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    @Override
    public void sacar(double valor) {
        if (this.saldo - valor >= 0) {
            super.sacar(valor);
        } else {
            System.out.println("Sem saldo");
        }
    }
}

package Exercicios.Classe3;

public abstract class ContaBancaria {

    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract double Sacar(double valor);


}

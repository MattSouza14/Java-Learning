package Exercicios.Classe3;

public class ContaCorrente  extends ContaBancaria{

    ContaCorrente(double saldo){
        super();
        this.setSaldo(saldo);
    }

    @Override
    public double Sacar(double valor) {
        this.setSaldo(this.getSaldo() - valor);
        return this.getSaldo();
    }

    public double Depositar(double valor) {
        this.setSaldo(this.getSaldo() + valor);
        return this.getSaldo();
    }
}

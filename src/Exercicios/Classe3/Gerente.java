package Exercicios.Classe3;

public class Gerente extends Funcionario{
    public Gerente(double salario, String nome) {
        super();
        this.setSalario(salario);
        this.setNome(nome);
    }


    @Override
    public double calcularSalario(double salario, double bonus) {
        this.setSalario(salario + bonus);
        return this.getSalario();
    }

    @Override
    public double calcularSalario(double salario) {
        return 0;
    }


}

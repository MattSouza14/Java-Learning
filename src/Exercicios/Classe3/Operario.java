package Exercicios.Classe3;

public class Operario extends  Funcionario{

    public Operario(double salario){
        super();
        this.setSalario(salario);
    }

    @Override
    public double calcularSalario(double salario, double bonus) {
        return 0;
    }

    @Override
    public double calcularSalario(double salario) {
        this.calcularSalario(salario);
        return this.getSalario();
    }
}

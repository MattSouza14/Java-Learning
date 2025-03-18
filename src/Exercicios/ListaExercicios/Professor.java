package Exercicios.ListaExercicios;

public class Professor extends Funcionario {

    public Professor(){
    }
    public Professor(int matricula, double salario, String nome, String sobrenome){
        super(matricula, salario, nome, sobrenome);
    }


    @Override
    public double getSalarioPrimeiraParcela() {
        return getSalario();
    }

    public double getSalarioSegundParcela(){
        return 0.0;
    }

}

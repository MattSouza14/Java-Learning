package Exercicios.ListaExercicios;

public class Funcionario extends Pessoa{
    private int matricula;
    private double salario;

    public Funcionario(){

    }
    public Funcionario(int matricula, double salario, String nome, String sobrenome){
       super(nome, sobrenome);
       this.matricula = matricula;
       this.salario = salario;

    }


    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalarioPrimeiraParcela(){
        if (salario < 0){
            System.out.println("O salario não pode ser negativo");
            return salario;
        }else{
            double primeiraParcela = salario - (salario * 0.40);
            return  primeiraParcela;
        }
    }

    public double getSalarioSegundaParcela(){
        double segundaParcela = salario - (salario * 0.60);
        return segundaParcela;

    }
}

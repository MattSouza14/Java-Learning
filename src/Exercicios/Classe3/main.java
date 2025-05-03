package Exercicios.Classe3;

public class main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(100);
        Gerente g = new Gerente(1000, "Mateus");
        Operario op = new Operario(1000);
     System.out.println(cc.Sacar(50));
     //System.out.println(cc.Depositar(200));
     System.out.println(g.calcularSalario(1000, 150));
     //.out.println(op.calcularSalario(1000));



    }
}

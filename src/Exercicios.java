import entities.Emplyoee;
import entities.Rent;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

       /*** Rent[] vect = new Rent[10];
        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        for (int i=1; i<=n; i++) {

            System.out.println("Rent #" + i + ":");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            vect[room] = new Rent(name, email);
        }

        System.out.println("Busy rooms:");
        for (int i=0; i<10; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }**/

        List<Emplyoee> listFunc = new ArrayList<>();
        System.out.print("Quantos funcionarios serão registrados ");
        int numFuncionarios = sc.nextInt();
        for (int i = 0; i < numFuncionarios; i++){
            System.out.println("Funcionario # " +(i+1) + ":");
            System.out.print("Id: ");
            int id = sc.nextInt();
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salario: ");
            double salary = sc.nextDouble();

            Emplyoee funcionarios = new Emplyoee(id, name, salary);
            listFunc.add(funcionarios);
        }
        System.out.println("Qual funcionario terá o salario aumentado - Informe o ID: ");
        int idFuncionario = sc.nextInt();

        Emplyoee funcionarioId = listFunc.stream().filter(x -> x.getId() ==idFuncionario).findFirst().orElse(null);
        if(funcionarioId != null){
            System.out.print("Digite a porcemtagem de aumento do salario: ");
            double percentage = sc.nextDouble();
            funcionarioId.salaryIncrement(percentage);
        }
        else{
           System.out.println("Id não existe");
        }
        System.out.println();
        System.out.println("List of employees:");
        for ( Emplyoee funcionarios  : listFunc) {
            System.out.println(funcionarios.toString());
        }
        sc.close();
    }
}

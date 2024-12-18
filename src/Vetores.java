import java.util.Locale;
import java.util.Scanner;

class  Vetores{
    public static void main(String[] args) {
    //Nome dado a arranjos unidimensionais -> array -> estrutura de dados

    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);
    int n = sc.nextInt();
    //Criando um vetor
        int[] vetInt = new int[5];
        char[] vetChar = new char[5];
        String[] vetString = new String[5];
        double[] vet = new double[n];
        for (int i=0; i < n; i++){
            vet[i] = sc.nextDouble();
        }
        //Mostrando valores das posições no vetor
        System.out.println(vet[0]);
        System.out.println(vet[1]);
        System.out.println(vet[2]);
        //length -> pega o tamanho do vetor
    }
}
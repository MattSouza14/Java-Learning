import java.util.Locale;
import java.util.Scanner;

public class Funcoes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int maiorNum = max(a,b,c);

        System.out.println("O maior número é: " + maiorNum);
    }
//Criando uma função
    public static int max (int x, int y, int z) {
        int aux;
        if(x > y && x >z) {
            aux = x;
        }
        else if(y > z) {
            aux = y;
        }
        else {
            aux = z;
        }

        return aux;
    }




}
//teste
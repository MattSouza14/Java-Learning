import java.util.Scanner;
public class Estruturas_Repetitivas {

    public static void main(String[] args) {
        //while -> repete um bloco  enquanto a condição for V
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int soma = 0;
        while(x > 0) {
            soma += x;
            x = sc.nextInt();
        }
        System.out.println(soma);

        //For -> repete um bloco para um certo intervalo de valores
        int y = sc.nextInt();
        for(int i = 1; i <= y; i++) {
            System.out.printf("\n%d° oi", i);
        }
    }
}
//teste
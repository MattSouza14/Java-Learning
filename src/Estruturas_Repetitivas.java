import java.util.Locale;
import java.util.Scanner;
public class Estruturas_Repetitivas {

    public static void main(String[] args) {
        //while -> repete um bloco  enquanto a condição for V
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
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
        System.out.println(" ");
        //ForEach
        String[] vetForEach = new String[]{"Mateus", "Mateusinho", "Matt"};

        for (String nomes : vetForEach){
            System.out.println(nomes);
        }
    }
}
//teste
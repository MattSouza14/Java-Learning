import java.util.Scanner;
public class Operador_Bitwise {

    public static void main(String[] args) {
        // & - bit a bit
        // | - bit a bit
        // ^ - ou exclusivo bit a bit -> retorna V se um for V(2V=>F)
        //0->false 1->true

        // 0101 1001
        //     &
        // 0011 1100
        //     =
        // 0001 1000

        Scanner sc = new Scanner(System.in);

        int mask = 0b00100000;
        int n = sc.nextInt();

        if((n & mask) != 0) {
            System.out.println("O sexto bit é Verdadeiro");
        }
        else {
            System.out.println("O sexto bit é falso");
        }

    }

}
//teste
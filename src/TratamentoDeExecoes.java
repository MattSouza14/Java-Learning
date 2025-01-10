import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamentoDeExecoes {
    //Exeção: qualquer condição de erro ou
    // comportamento inesperado encontrado por um programa em execução

    //Throwable ---Error: Não se espera que o programador vai tratar
    // OutOfMemoryError - estouro de memoria
    // VirtuaMachineError - erro na maquina virtual do java
    //Exception :
    //IOException - erro de entrada ou saida
    //RuntimeException:
    //IndexOutBoundsException - Quando tenta acessar uma posição do array que não existe
    //NullPointerExcepiton - Quando tenta acessar uma variavel com valor nulo
    //FileNotFoundException - Arquivo não encontrado
    public static void main(String[] args) {

        //Estrutura try-catch
        Scanner sc = new Scanner(System.in);
        try {
            String[] vect = sc.nextLine().split(" ");
            int pos = sc.nextInt();
            System.out.println(vect[pos]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Posição do array invalida!");
//            e.printStackTrace(); faz o rastreio da exceção
        }catch (InputMismatchException e){
            System.out.println("Valor invalido no input");
        }finally{
//      bloco que contem o codigo a ser executado independentemente de ter ocorrido ou não uma exceção
        System.out.println("Fim");
        sc.close();
       }


    }

}

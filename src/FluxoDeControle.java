package src;

public class FluxoDeControle {
    public static void main(String[] args) {
        int idade = 24;
        if(idade >=18 && idade < 70){
          System.out.println("Maior idade");  
        }
        else if(idade >=70){
          System.out.println("Chama o INSS");  
        }
        else{
          System.out.println("Menor idade");  

        }
    }
}

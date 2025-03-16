import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class GravacaoLeituraDeArquivos {
    //FileReader sequencia de leitura de caracteres a partir de um arquivo
    //BufferredReader
    public static void main(String[] args) {
        //File representação abstrata de um arquivo e seu caminho
//        File file = new File("d:\\texto.txt");
        String path ="d:\\\\texto.txt";
        FileReader fr = null;
        BufferedReader br= null;

        try{
            fr = new FileReader(path);
            br= new BufferedReader(fr);

            String line = br.readLine();
            while(line != null){
                System.out.println(line);
                line = br.readLine();
            }

        }catch (IOException e){
            System.out.println("Erro: " +  e.getMessage());

        }finally {
            try{
                if (br != null){
                    br.close();
                }
                if(fr != null){
                    fr.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }


    }
}

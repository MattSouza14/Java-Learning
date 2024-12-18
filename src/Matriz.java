import java.util.Scanner;

public class Matriz {
    //Arranjos bidimensionais -> vetores de vetores
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Instanciando a matriz
        int[][] mat = new int[n][n];

        for (int i=0; i<n; i++){
            for (int j =0; j <n; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        for (int i=0; i<n; i++){
            System.out.println(mat[i][i] + " ");
        }

        int negativos =0;
        for (int i=0; i<n; i++) {
            for (int j = 0; j < n; j++) {
                if(mat[i][j] < 0){
                    negativos++;
                }
            }
            System.out.println(negativos);
        }
        sc.close();
    }
}

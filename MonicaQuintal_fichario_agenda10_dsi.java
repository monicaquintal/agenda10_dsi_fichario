package monicaquintal_fichario_agenda10_dsi;
 
import javax.swing.JOptionPane;

public class MonicaQuintal_fichario_agenda10_dsi {

    public static void main(String[] args) {
        // declaração de variáveis
        int matrizA[][] = new int[10][10];
        int matrizB[][]= new int [10][10];
        int matrizC[][]=new int [10][10];
        int linha, coluna;
        String exibir = "";
        
        //entrada de dados
            //matriz A
            for (linha = 0; linha < 10; linha++){
                for (coluna = 0; coluna < 10; coluna++) {
                    matrizA[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Insira o elemento [" + linha + "] [" + coluna + "] da matriz A."));
                } // fim for coluna
            } // fim for linha

            //matriz B
            for (linha = 0; linha < 10; linha++){
                for (coluna = 0; coluna < 10; coluna++) {
                    matrizB[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Insira o elemento [" + linha + "] [" + coluna + "] da matriz B."));
                } // fim for coluna
            } // fim for linha
            
            // cálculo da matriz C
            for (linha = 0; linha < 10; linha++){
                for (coluna = 0; coluna < 10; coluna++) { 
                    matrizC[linha][coluna] = matrizA[linha][coluna] + matrizB[linha][coluna];
                } // fim for coluna
            } // fim for linha
            
            // saída
            for (linha = 0; linha < 10; linha++){
                for (coluna = 0; coluna < 10; coluna++) { 
                    exibir += matrizC[linha][coluna] + " | ";
                    //JOptionPane.showMessageDialog(null, "C [" + linha + "] [" + coluna + "] = " + matrizC[linha][coluna]);
                } // fim for coluna
                exibir += "\n";
            } // fim for linha
            JOptionPane.showMessageDialog(null, "Os valores da matriz C são: \n" + exibir);
   
    } // fim main
} // fim class
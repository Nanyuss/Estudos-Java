package desafiosgpt;


public class MatrizSomaLinhasColunas {
    public static void main(String[] args) {
        int[][] matriz = {
            {23, 27, 11},
            {22, 5, 16},
            {99, 12, 34}
        };

        System.out.println("Matriz: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.println();
        }
        
        System.out.println("Soma das linhas: ");
        for (int i = 0; i < matriz.length; i++) {
            int resultado = 0;
            for (int num : matriz[i]) {
                resultado += num;
            }
            System.out.printf("%d ", resultado);
        }

        System.out.println("\nSoma das colunas: ");
        for (int j = 0; j < matriz[0].length; j++) {
            int resultado = 0;
            for (int[] arrayBase : matriz) {
                resultado += arrayBase[j];
            }
            System.out.printf("%d ", resultado);
        }

    }
}
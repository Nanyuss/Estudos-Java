package maratonajava.aulas;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        //Imprima os primeiros 25 números dados de um valor, Exemplo 50
        int valorMax = 50;
        for (int i = 0; i <= valorMax; i++) {
            if (i > 25) {
                break;
            }
            System.out.println(i);
        }
    }
}

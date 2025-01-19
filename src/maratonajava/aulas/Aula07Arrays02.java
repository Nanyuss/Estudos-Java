package maratonajava.aulas;

public class Aula07Arrays02 {
    public static void main(String[] args) {

        //byte, short, int, long, float e double o valor padrão é 0
        //char '\u0000' ' '
        //boolean false
        //String null
        String[] nomes = new String[4];
        nomes[0] = "Maria";
        nomes[1] = "João";
        nomes[2] = "Pedro";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}

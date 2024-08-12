package maratonajava.aulas;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for

        int count = 0;
        while (count < 10) { // irá executar até a condição se tornar false
            System.out.println(++count);
        }

        count = 0;
        do { // Irá executar 1 vez independente do valor
            System.out.println("Dentro do-while "+ ++count);
        } while (count < 10);

        for (int i = 0; i < 10; i++) {
            System.out.println("for "+ i);
        }
    }
}

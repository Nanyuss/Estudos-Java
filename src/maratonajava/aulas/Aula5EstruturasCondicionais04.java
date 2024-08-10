package maratonajava.aulas;

public class Aula5EstruturasCondicionais04 {
    public static void main(String[] args) {
        // Imprima o dia da semana, sabendo que 1 é domingo
        byte dia = 6;

        // char, byte, int, short, enum, String
         switch (dia) {
            case 1:
                System.out.println("Dom");
                break;
            case 2:
                System.out.println("Seg");
                break;
            case 3:
                System.out.println("Ter");
                break;
            case 4:
                System.out.println("Qua");
                break;
            case 5:
                System.out.println("Qui");
                break;
            case 6:
                System.out.println("Sex");
                break;
            case 7:
                System.out.println("Sáb");
            default:
                System.out.println("Valor inválido");
                break;
         }

        char sexo = 'M';
        switch (sexo) {
            case 'M':
                System.out.println("Masculino");
                break;
            case 'F':
                System.out.println("Feminino");
                break;
            default:
                System.out.println("Valor inválido");
                break;
        }
    }
}

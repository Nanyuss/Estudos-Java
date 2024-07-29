package maratonajava.exercicios;

/*
Aula03TiposPrimitivosExercicio

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salário> na data <data>.
 */
public class Aula03TiposPrimitivosExercicio {

    public static void main(String[] args) {
        String nome = "Nanyus";
        String endereco = "Endereço fictício - 1234";
        double salario = 2300.90;
        String data = "12/12/2012";

        System.out.println("Eu "+nome+", morando no endereço "+endereco+", confirmo que recebi o salário de R$"+salario+" na data "+data+".");
    }
}
package maratonajava.aulas;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Doar se salario > 5000

        double salario = 6000;
        String Doar = "Irei doar 1000";
        String NaoDoar = "Não tenho condições para doar";

        // (condicao) ? verdadeiro:falso
        String Resultado = salario > 5000 ? Doar:NaoDoar;
        System.out.println(Resultado);
    }
}

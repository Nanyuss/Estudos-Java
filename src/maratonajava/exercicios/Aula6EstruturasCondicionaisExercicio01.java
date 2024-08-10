package maratonajava.exercicios;

public class Aula6EstruturasCondicionaisExercicio01 {
    public static void main(String[] args) {
        // Ver quanto de taxa tenho que pagar de acordo com o salario anual
        double salarioAnual =50000;
        double resultado;

        if (salarioAnual <= 34712) {
            resultado = salarioAnual * 9.70/100;
        } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
            resultado = salarioAnual * 37.35/100;
        } else {
            resultado = salarioAnual * 49.50/100;
        }
        System.out.println("Ganho um salario anual de " + salarioAnual + ", portanto terei que pagar uma taxa de " + resultado);
    }
}

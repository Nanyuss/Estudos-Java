package maratonajava.exercicios;

public class Aula06EstruturasDeRepeticaoExercicio02 {
    public static void main(String[] args) {
        //Dado o valor de um carro, descubra em quanto ele pode ser parcelado
        //Condição valorParcela >= 1000;
        double valorTotal = 50000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal/parcela;
            if (valorParcela < 1000) {
                break;                
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }
    }
}
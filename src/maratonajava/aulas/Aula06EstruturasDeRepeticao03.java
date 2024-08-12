package maratonajava.aulas;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        //Dado o valor de um carro, descubra em quanto ele pode ser parcelado
        //Condição valorParcela >= 1000;
        double valorTotal = 50000;
        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal/parcela;
            if (valorParcela < 1000) {
                continue;                
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }
    }
}

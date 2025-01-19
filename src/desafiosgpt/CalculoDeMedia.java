package desafiosgpt;

public class CalculoDeMedia {
    public static void main(String[] args) {
        //float[] notasAluno = {6.5F, 9.0F, 5.0F, 4.0F, 8.0F};
        float[] notasAluno = {6.5F, 9.0F, 7.0F, 6.0F, 8.5F};

        float somaNotas = 0;
        for (float notas: notasAluno) {
            somaNotas += notas;
        }

        float mediaFinal = somaNotas / notasAluno.length;

        if (mediaFinal >= 7.0F) {
            System.out.println("Aluno aprovado com média: " + mediaFinal);
        } else {
            System.out.println("Aluno reprovado com média: " + mediaFinal);
        }
    }
}

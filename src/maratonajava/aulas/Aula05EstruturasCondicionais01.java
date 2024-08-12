package maratonajava.aulas;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        if(true) System.out.println("Dentro do if com 1 linha");
        if (true) {
            System.out.println("Dentro do if");
        }
        System.out.println("Fora do if");

        //---------------------------------------\\
        System.out.println("//---------------------------------------\\");
        //---------------------------------------\\

        int idade = 20;
        boolean Autorizacao = idade >= 18;
        if (Autorizacao) {
            System.out.println("Autorizado a comprar bebida");
        }else{
            System.out.println("Não autorizado a comprar bebida");
        }
        
        if (!Autorizacao) {
            System.out.println("Não autorizado a comprar bebida");
        }

        boolean c = true;
        if (c == false) { //(c = false) seilá pra que coloquei isso
            System.out.println("Dentro de algo que nunca deve ser feito");
        }
    }
}

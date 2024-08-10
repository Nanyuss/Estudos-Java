package maratonajava.aulas;

public class Aula5EstruturasCondicionais02 {
    public static void main(String[] args) {
        // idade < 15 categoria infatil
        // idade >= 15 && idade < 18 categoria juvenil
        // idade >= 18 categoria adulta

        int idade = 17;
        String categoria;
        if (idade < 15) {
            categoria = "Categoria infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Categoria juvenil";
        } else {
            categoria = "Categoria adulta";
        }
        System.out.println(categoria);
    }
}

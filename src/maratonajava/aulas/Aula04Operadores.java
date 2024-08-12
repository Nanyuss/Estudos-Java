package maratonajava.aulas;

public class Aula04Operadores {
    public static void main(String[] args) {
        /*
         + -> Adição
         - -> Subitração
         * -> Multiplicação
         / -> Divisão
         */

         int numero01 = 10;
         int numero02 = 20;
         double resultado = numero01/ (double) numero02; // Divisão de dois numeros inteiros vai gerar um numero inteiro. Para gerar um numero quebrado pelo menos um deles tem que ser do tipo double/float

         System.out.println(resultado);

         // % -> Resto
         int resto = 21%7;
         System.out.println(resto);

         /*
          < -> Maior que
          > -> Menor que
          <= -> Igual ou menor que
          >= -> Igual ou maior que
          == -> Igual
          != Diferente
          */
          // Irão sempre retornar um valor boolean

          boolean DezMaiorQueVinte = 10 > 20;
          boolean DezMenorQueVinte = 10 < 20;
          boolean DezIgualVinte = 10 == 20;
          boolean DezIgualDez = 10 == 10;
          boolean DezDiferenteDez = 10 != 10;

          System.out.println("Dez maior que vinte: " + DezMaiorQueVinte);
          System.out.println("Dez menor que vinte: " + DezMenorQueVinte);
          System.out.println("Dez igual a vinte: " + DezIgualVinte);
          System.out.println("Dez igual a dez: " + DezIgualDez);
          System.out.println("Dez diferente de dez: " + DezDiferenteDez);

          /*
           && -> AND
           || -> OR
           ! -> NOT
           */

           int idade = 29;
           float salario = 3590F;
           boolean DentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
           boolean DentroDaLeiMenorQueTrinta = idade <= 30 && salario >=3381;

           System.out.println("Dentro da lei maior que trinta: " + DentroDaLeiMaiorQueTrinta);
           System.out.println("Dentro da lei menor que trinta: " + DentroDaLeiMenorQueTrinta);

           double valorTotalContaCorrente = 200;
           double valorTotalContaPoupanca = 10000;
           float valorPlaystation = 5000;
           boolean PlaystationCompravel = valorTotalContaCorrente >= valorPlaystation || valorTotalContaPoupanca >= valorPlaystation;
           System.out.println("Playstation compravel: " + PlaystationCompravel);

           /*
            = -> igual
            += -> adição igual
            -= -> subtração igual
            *= -> multiplicação igual
            /= -> divisão igual
            %= -> resto igual
            */

            double bonus = 200;
            bonus += 2000;
            bonus -= 200;
            bonus *= 4;
            bonus /= 2;
            bonus %= 2;
            System.out.println(bonus);

            /*
             ++ -> adiciona 1
             -- -> retira 1
             */
            int contador = 0;
            contador += 1; // contador = contador + 1;
            contador++;
            contador--;
            ++contador;
            --contador;
            System.out.println(contador);

            int contador2 = 0;
            System.out.println(++contador2);

    }
}
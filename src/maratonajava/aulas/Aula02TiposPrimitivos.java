package maratonajava.aulas;

/**
 * Aula02TiposPrimitivos
 */
public class Aula02TiposPrimitivos {

    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        
        /*
        Tipo | Faixa de valores que podem ser armazenados | Tamanho | Valor padrão

        int -> -2,147,483,648 até 2,147,483,647 | bytes 4 | padrão 0
        double -> 1.7e-308 até 3.4e+3.8 | bytes 8 | padrão 0.0d
        float -> 3.4e-038 até 3.4e+038 | bytes 4 | padrão 0.0f
        char -> None | bytes 2 | padrão /u0000 #Tabela Ascii ou Unicode
        byte -> -128 até -127 | bytes 1 | padrão 0
        short -> -32,768 até 32,767 | bytes 2 | padrão 0
        long -> -9,223,372,036,854,755,808 até 9,223,372,036,854,750,000 | padrão 0
        boolean -> true ou false | bit 1 | padrão false
         */
        
        int idadeInt = 22;
        double salarioDouble = 2000.0;
        float salarioFloat = 2500.0F;
        char caractere = 65;
        byte numeroByte = -128;
        short idadeShort = 30;
        long idadeLong = 100;
        boolean verdadeiro = true;
        boolean falso = false;

        // Casting -> Forçar a entrada de um valor;
        int ForceInt = (int) 1000000000000000L;
        long ForceLong = (long) 2000.00D;

        // String
        String texto = "Olá, mundo!";

        System.out.println("Int: "+idadeInt);
        System.out.println("Double: "+salarioDouble);
        System.out.println("Float: "+salarioFloat);
        System.out.println("Char: "+caractere);
        System.out.println("Byte: "+numeroByte);
        System.out.println("Short: "+idadeShort);
        System.out.println("Long: "+idadeLong);
        System.out.println("BooleanTrue: "+verdadeiro);
        System.out.println("BooleanFalse: "+falso);

        System.out.println("Forçando um número do tipo long virar um int: "+ ForceInt);
        System.out.println("Forçando um número do tipo double virar um long: "+ ForceLong);

        System.out.println("String: "+texto);
    }
}
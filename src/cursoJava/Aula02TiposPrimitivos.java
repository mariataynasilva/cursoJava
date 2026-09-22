package cursoJava;

public class Aula02TiposPrimitivos {
    static void main(String[] args) {
        // int, double , float, char, byte, short, long, boolean

         int idade =(int) 10000000000L; //isso aqui e um casting, ele vai fica cortando o numero, quando e numero grande
        // nao da pra fazer isso, nao é bom fazer, e melhor muda a variavel.
         double salarioDouble = 2000.0D;
         // convençao de codigo
         float salarioFloat = 2500.0F;
         byte idadeByte = 10;
         short idadeShort = 10;
         boolean verdadeiro = true;
         boolean falso = false;
         char caractere = '\u0043';

         System.out.println("idade é "+idade+" anos");
        System.out.println(verdadeiro);
        System.out.println("char "+caractere);
    }

}




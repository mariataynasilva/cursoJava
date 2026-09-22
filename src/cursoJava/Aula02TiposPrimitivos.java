package cursoJava;

public class Aula02TiposPrimitivos {
    static void main(String[] args) {
        // int, double , float, char, byte, short, long, boolean

         int idade =(int) 10000000000L; //isso aqui e um casting, ele vai fica cortando o numero, quando e numero grande
        // e pode muda a numeraçao por esta forçando a mudança de variavel, e melhor muda o tipo do que fazer isso.
         long numeroGrande = (long) 155.23;
         double salarioDouble = 2000.0D;
         // convençao de codigo
         float salarioFloat = 2500.0F;
         byte idadeByte = 10;
         short idadeShort = 10;
         boolean verdadeiro = true;
         boolean falso = false;
         char caractere = '\u0043';
         String nome = "alya";


         System.out.println("idade é "+idade+" anos");
         System.out.println(verdadeiro);
         System.out.println("char "+caractere);
         System.out.println(numeroGrande);
         System.out.println("seu nome é "+nome);
    }

}




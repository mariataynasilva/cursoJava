package cursoJava;
/*
Pratica

crie variaveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salario de <salario>, na data <data>

 */
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "alya";
        String endereco = "Av joao das pontes fontes";
        double salario = 5467.8;
        String dataRecibimentoSalario = "23/08/2026";
        String relatorio = "Eu "+nome+" morando no endereço "+endereco+" confirmo que recebi o salario de"+salario+" ,na data "+dataRecibimentoSalario;
        System.out.println(relatorio);
    }
}

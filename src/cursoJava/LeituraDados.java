package cursoJava;
import java.util.Scanner;

public class LeituraDados {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine()


        Scanner scanner1 = new Scanner(System.in);
        System.out.println("digite seu salario:");
        double salario = scanner.nextDouble();

        System.out.println("ola ,"+nome+" seu salario é "+salario);

        scanner.close();
    }
} ta bonitinho o codigo desse jeito ? a identaçao ta feia?




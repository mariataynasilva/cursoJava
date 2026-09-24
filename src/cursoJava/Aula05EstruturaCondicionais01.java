package cursoJava;

public class Aula05EstruturaCondicionais01 {
    public static void main(String[] args) {
        // IF
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;
        if (isAutorizadoComprarBebida){
            System.out.println("Autorizado a comprar bebida alcolica");
        }
        else{
            System.out.println("nao autorizado a comprar bebida alcolica");
        }
        // nunca deve ser feito isso
        boolean c = true;
        if (c = false){
            System.out.println("dentro de algo que nunca deve ser feito");
        }
    }
}

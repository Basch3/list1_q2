import java.util.Scanner;

public class list1_q2 {
    public static void main(String[] args) throws Exception  
    {
        Scanner teclado = new Scanner(System.in);
        //1 Pedir para digitar um número
        System.out.print("Digite um número: ");
        String número = teclado.nextLine();
        //2 Fazer aparecer a mensagem pedida
        System.out.print("O número informado foi "+número);
        teclado.close();
    }

}
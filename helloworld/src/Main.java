//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Sistema iniciando...");
        System.out.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do\n"  +
                " eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim\n" +
                " ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut \n" +
                "aliquip ex ea commodo consequat. Duis aute irure dolor in \n" +
                "reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla\n" +
                " pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa\n " +
                "qui officia deserunt mollit anim id est laborum.\n");

        System.out.println ("\u001B[33m"+
                """
                Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
                 eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
                 ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
                aliquip ex ea commodo consequat. Duis aute irure dolor in
                reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
                 pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa
                 qui officia deserunt mollit anim id est laborum.
                """+"\u001B[0m");

        // Habilita a leitura do teclado
        var scanner = new Scanner (System.in);
        //informar que usuário precisa digitar um texto

        System.out.println("Digite um texto");

//ler o texto digitado

        var texto = scanner.nextLine ();
        //tipos primitivos

        String textoexemplo = "Olá, mundo";

        int numero = 10;
        int numero2 = -10;
        var numero3= 10;
        long numeroGrande= 100000000L;

        //double vs float: Double é mais preciso porém ocupa mais espaço na memória.
        double numeroVirgula = 10.5;
        float numeroVirgula2 = 20.5f;
        boolean condicao = true; // true ou false
        char caractere = 'A';
        byte numeropequeno2= 10;
        var textoExemplo2 = "teste";

        var calculo = numero+numero*(numero2 / numero3) +15-23;



        System.out.println(numero2+ (numero3 * numero2)/2);
//cast tipos
        var numero4 = 30;
        var calculo2 = (double) numero4 /7;
//cast por parse

        var numeroVirgula7 = Double.parseDouble("30.9");

        System.out.printf("Sistema finalizado.");


        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}
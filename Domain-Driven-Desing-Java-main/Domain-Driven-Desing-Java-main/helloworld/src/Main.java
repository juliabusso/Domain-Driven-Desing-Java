import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Arrays ou vetores
        var telefones = new String[]
                {"11900000000", "1191000000", "11923232323", "1195678098"};
        var numeros = new int[] {1,2,3,4,5,6,7,8,9,10};
        var precos = new double[] {10.5, 20.5, 30.5, 40.5};

        for(var telefone : telefones) {
            System.out.println(telefone);
        }

        int contador = 0;
        while (contador < 5){
            System.out.println("Contador: " + contador);
            contador++;
        }
    }

    public static void variaveis(){
        System.out.println("Sistema iniciando...");

        System.out.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam eget ligula\n" +
                " eu lectus lobortis condimentum. Aliquam nonummy auctor massa.\n" +
                " Pellentesque habitant morbi tristique senectus et netus et malesuada\n" +
                " fames ac turpis egestas. Nulla at risus. Quisque purus magna, auctor et,\n" +
                " sagittis ac, posuere eu, lectus. Nam mattis, felis ut adipiscing.\n");

        System.out.println("\u001B[33m"+
                """
                
                Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam eget ligula
                 eu lectus lobortis condimentum. Aliquam nonummy auctor massa.
                 Pellentesque habitant morbi tristique senectus et netus et malesuada
                 fames ac turpis egestas. Nulla at risus. Quisque purus magna, auctor et,
                 sagittis ac, posuere eu, lectus. Nam mattis, felis ut adipiscing.
                
                """ + "\u001B[0m");

        // Habilita a leitura do teclado
        var scanner = new Scanner(System.in);
        // informar que usuário precisa digitar um texto
        System.out.println("Digite um texto: ");
        // ler o texto digitado
        var texto = scanner.nextLine();
        System.out.println(texto);

        // tipos primitivos
        String textoDeExemplo = "Olá mundo";
        short numeroPequeno = 10;
        int numero = -10;
        int numero2 = 10;
        long numeroGrande = 1000000000000000000L;
        // double vs float: double é mais preciso porém ocupa mais espaço na memória
        double numeroComVirgula = 10.5;
        float numeroComVirgula2 = 10.5f;
        boolean condicao = true; // true ou false
        char caractere = 'A';
        byte numeroPequeno2 = 10;

        //var surge a partir do Java 10
        var textoDeExemplo2 = "teste";
        var numero3 = 10;
        var numeroLongo2 = 1000000000000000000L;
        var numeroComVirgula3 = 10.5;
        var condicao2 = true;

        var calculo = numero + numero * (numero2 / numero3) + 15 - 23;
        System.out.println(numero2 + (numero3 * numero2) / 2);

        // cast de tipos
        var numero4 = 30;
        // conversao implicita
        var calculo2 = (double) numero4 / 7;
        // cast por parse (conversao explicita)
        var numeroComVirgula7 = Double.parseDouble("30.9");

        var telefone = "01234567890";
        var distancia = 10.5;
        var temperatura = 16.0 / 2 ;



        numeroComVirgula = 20.5;
        System.out.println(numeroComVirgula);
        numeroComVirgula = 34.6;

        System.out.println("Sistema finalizado.");
    }

    public static void operadoresDeDecisao(){
        var idade = 20;
        //se a idade for menor de 18, sem autorização
        // senão
        // isso na matematica e f(x) = x ? true : false
        System.out.println(
                idade < 18 || idade > 199 && idade == 50 ?
                        "Você tem uma idade invalida, sem autorização" :
                        "bem vindo");

        if(true){
            System.out.println("bem vindo");
            System.out.printf("ola");
        }
        else
            System.out.printf("nao autorizado");

        var numero = 10;
        System.out.println(
                numero % 2 == 0 ? "O numero é par" : "o numero é impar");
    }
}
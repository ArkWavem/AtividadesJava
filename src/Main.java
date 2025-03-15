



public class Main {
    public static void main(String[] args) {

     //Média de Três números
        int num01 = 70;
        int num02 = 20;
        int num03 = 55;
        int media = (num01+num02+num03)/3;
        double media01 = (num01+num02+num03)/3.0;
        float media02 = (num01+num02+num03)/3.0f;
        long media03 = (num01+num02+num03)/3L;

        System.out.println("A média do inteiro é: " + media);
        System.out.println("A média do número real é: " + media01);
        System.out.println("A média do número float é: " + media02);
        System.out.println("A média do número long é: " + media03);

        System.out.println();
        System.out.println("----------------------------------------------------------------");

        //Declaração de Long
        long distancia = 149600000L;
        System.out.println("A distância da Terra ao Sol é: " + distancia + " km.");

        System.out.println();
        System.out.println("----------------------------------------------------------------");
        //Valor Unicode de um Caractere



        char letra = 'A';
        char letra1 = 'F';
        char letra2 = 'H';
        char letra3 = 'O';
        char letra4 = 'S';

        int valorUnicode = letra;
        System.out.println("O valor Unicode de '" + letra + "' é: " + valorUnicode);


        int valorUnicode1 = letra1;
        System.out.println("O valor Unicode de '" + letra1 + "' é: " + valorUnicode1);

        int valorUnicode2 = letra2;
        System.out.println("O valor Unicode de '" + letra2 + "' é: " + valorUnicode2);

        int valorUnicode3 = letra3;
        System.out.println("O valor Unicode de '" + letra3 + "' é: " + valorUnicode3);

        int valorUnicode4 = letra4;
        System.out.println("O valor Unicode de '" + letra4 + "' é: " + valorUnicode4);





        //Boas Práticas com Tipos Booleanos
        System.out.println();
        System.out.println("----------------------------------------------------------------");

        int numero = 5;

        boolean maiorQueDez = numero > 10;

        System.out.println("O número " + numero + " é maior que 10? " + maiorQueDez);




        //Usando Arrays
        System.out.println();
        System.out.println("----------------------------------------------------------------");

        int[] numeros = {17770, 20, 30, 467676760, 50, 70, 68, 99};
        System.out.println("Primeiro número: " + numeros[0]);
        System.out.println("Primeiro número: " + numeros[3]);
        System.out.println("Primeiro número: " + numeros[5]);
        System.out.println("Primeiro número: " + numeros[4]);
        System.out.println("Último número: " + numeros[numeros.length - 1]);

        //Calculando a Área de um Retângulo
        System.out.println();
        System.out.println("----------------------------------------------------------------");

        double altura = 15.7;
        double largura = 5.7;
        double area = altura * largura;
        System.out.println("A área do retângulo é: " + area);

        //Trabalhando com Strings e dados multivalorados
        System.out.println();
        System.out.println("----------------------------------------------------------------");

        String nome = "João";
        int idade = 46;
        double peso = 72.7;;

        System.out.println("Olá, meu nome é " + nome + ", minha idade é "+idade+ " e o meu peso é "+peso);
    }
}
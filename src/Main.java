



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


    }
}
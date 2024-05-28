import java.util.Scanner;//importa o Scanner, pra fazer a leitura de dados


public class Geojava extends Espacial {//cria a classe principal
    public static Scanner input = new Scanner(System.in);//instancia um objeto "input" que utiliza o método Scanner, o "system.in" é para definir que será uma entrada de dados
    //fazemos isto fora dos outros métodos e deixamos static pra poder utilizá-lo com escopo global e referenciá-lo na main, que é static

    public static int Escolha(){
        while (!input.hasNextInt()) {
            System.out.println("Digite uma entrada válida. (Apenas números)");
            Menu();
            input.next();
        }
        int escolha = input.nextInt();
        return escolha;
    }

    public static void Menu(){
        System.out.println(" .88888.                           dP                            \r\n" + //
                        "d8'   `88                          88                            \r\n" + //
                        "88        .d8888b. .d8888b.        88 .d8888b. dP   .dP .d8888b. \r\n" + //
                        "88   YP88 88ooood8 88'  `88        88 88'  `88 88   d8' 88'  `88 \r\n" + //
                        "Y8.   .88 88.  ... 88.  .88 88.  .d8P 88.  .88 88 .88'  88.  .88 \r\n" + //
                        " `88888'  `88888P' `88888P'  `Y8888'  `88888P8 8888P'   `88888P8");

        System.out.println("====================================================================");
        System.out.println("Qual figura você deseja calcular o volume/área?");
        System.out.println("1.Triângulo");
        System.out.println("2.Prisma");
        System.out.println("5.Sair");
        
    }
    
    public static void main(String[] args) {
        int operacao;
        while (true) {
            Menu();
            operacao = Escolha();
            switch (operacao){
            case 1:Triangulo();
                break;
            case 2:Prisma();
                break;
            case 3:System.out.println("Obras em andamento. Desculpe o transtorno!");
                break;
            case 5:System.exit(0);
                break;
            default:System.out.println("Digite uma opção válida! Por favor.");
                break;
            }
        }
        
    }
}

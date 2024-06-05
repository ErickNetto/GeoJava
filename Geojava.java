import java.util.Scanner;//importa o Scanner, pra fazer a leitura de dados


public class Geojava extends Espacial {//cria a classe principal
    public static Scanner input = new Scanner(System.in);//instancia um objeto "input" que utiliza o método Scanner, o "system.in" é para definir que será uma entrada de dados
    //fazemos isto fora dos outros métodos e deixamos static pra poder utilizá-lo com escopo global e referenciá-lo na main, que é static

    public static int MenuReturn(){
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
        System.out.println("Escolha o tipo de geometria:");
        System.out.println("1.Plana");
        System.out.println("2.Espacial");
        System.out.println("0.Sair");
        
    }
    public static void Plana(){
        
        System.out.println("====================================================================");
        System.out.println("1.Triângulo");
        System.out.println("2.Quadrado");
        System.out.println("3.Círculo");
        System.out.println("4.Losango");
        System.out.println("5.Retângulo");
        System.out.println("6.Trapézio");
        System.out.println("0.Sair");
        System.out.print("Escolha a forma geométrica desejada:");
        int opcao = ValidaInt();
        ValidaSair(opcao);
        switch(opcao){
            case 1:Triangulo();
            break;
            case 2:Retangulo();
            break;
            //case 3:Circulo();
            //break;
            case 4:Losango();
            break;
            case 5:Retangulo();
            break;
            //case 6:Trapezio();
            //break;
            default:System.out.println("Escolha uma opção válida");
            Plana();
            break;
        }

    }
    public static void Espacial(){
        
        System.out.println("====================================================================");
        System.out.println("1.Prisma");
        System.out.println("2.Pirâmide");
        System.out.println("3.Cilindro");
        System.out.println("4.Cubo");
        System.out.println("5.Esfera");
        System.out.println("6.Cone");
        System.out.println("0.Sair");
        System.out.print("Escolha a forma geométrica desejada:");
        int opcao = ValidaInt();
        ValidaSair(opcao);
        switch(opcao){
            case 1:Prisma();
            break;
            //case 2:Piramide();
            //break;
            //case 3:Cilindro();
            //break;
            //case 4:Cubo();
            //break;
            //case 5:Esfera();
            //break;
            //case 6:Cone();
            //break;
            default:System.out.println("Escolha uma opção válida");
            Espacial();
            break;
            }
        }
    
    public static void main(String[] args) {
        int operacao;
        while (true) {
            Menu();
            operacao = MenuReturn();
            switch (operacao){
            case 0: System.exit(0);break;
            case 1:Plana();
                break;
            case 2:Espacial();
                break;
            default:System.out.println("Digite uma opção válida! Por favor.");
                break;
            }
        }
        
    }
}

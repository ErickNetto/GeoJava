import java.util.Scanner;//importa o Scanner, pra fazer a leitura de dados


public class Geojava{//cria a classe principal
    public static Scanner input = new Scanner(System.in);//instancia um objeto "input" que utiliza o método Scanner, o "system.in" é para definir que será uma entrada de dados
    //fazemos isto fora dos outros métodos e deixamos static pra poder utilizá-lo com escopo global e referenciá-lo na main, que é static
   
    public static void Triangulo(){
        //aqui criamos um dos métodos, que será do tipo void, pois o resultado será armazenado em uma variável que será impressa na tela, ao invés de retornar como dado, isso porque caso fizessemos cada uma com a sua tipagem certinha ia dar um trabalhão para arrumar os erros de tipagens da utilização dos dados retornados no retorno deles para a main, onde estará a interface/interação com usuário


        System.out.println("Qual o valor da base?"); //aqui só imprime na tela a pergunta
        Double base = input.nextDouble(); //aqui chamamos o objeto input, que foi instanciado na linha 4, juntamente de "nextDouble()" que diz que o dado armazenado neste input, via Scanner, será do tipo Double e o armazenamos em uma variável de tipo Double
        System.out.println("Qual o valor da altura?");
        Double altura = input.nextDouble();
        //nas duas linhas anteriores, fazemos a mesma coisa que na linha 11 e 12, porém agora pra armazenar a altura
        Double result = altura*base;//aqui fazemos o cálculo necessário, nesse caso do triângulo a multiplicação da base pela altura, e armazenamos
        System.out.println(result);//aqui imprimimos na tela a variável result, que contém o resultado da conta
    }
     //agora é só fazer praticamente a mesma coisa para os outros métodos necessários, levando em consideração os dados necessários para colocar na fórmula e levando em consideração se o usuário quer descobrir o volume ou a área

    public void Quadrado(){
 
    }
 
    public void Retangulo(){
 
    }
 
    public void Losango(){
 
    }
 
    public void Trapezio(){
 
    }
 
    public void Circulo(){
 
    }
 
    public static void Prisma(){
        System.out.println("Deseja calcular o volume ou a área total?");
        System.out.println("1.Volume");
        System.out.println("2.Área total");
        int volouat = input.nextInt();
        if (volouat == 1) {
            System.out.println("Qual é a área da base?");
            Double areaBasePrisma = input.nextDouble();
            System.out.println("Qual é a altura do prisma?");
            Double alturaPrisma = input.nextDouble();
            Double volumePrisma = areaBasePrisma*alturaPrisma;
            System.out.println("O volume do prisma é de "+volumePrisma+" m³");
           
           
        }
        if (volouat == 2) {
            System.out.println("Qual é a área da base?");
            Double areaBasePrisma = input.nextDouble();
            System.out.println("Qual é a área lateral?");
            Double areaLateralPrisma = input.nextDouble();
            Double areaTotalPrisma = areaBasePrisma+areaLateralPrisma;
            System.out.println("A área total do prisma é de "+areaTotalPrisma+" m²");
           
           
        }
    }
   
 
    public static void main(String[] args) {
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
        int operacao = input.nextInt();
        switch (operacao){
            case 1:Triangulo();
                break;
            case 2:Prisma();

                break;
            case 3:System.out.println("Obras em andamento. Desculpe o transtorno!");
                break;
            default:System.out.println("Digite uma opção válida! Por favor.");
                break;
        }
 
 
       
    }
}
 
import java.util.Scanner;

public class Plano {
    public static Scanner input = new Scanner(System.in);
    
    public static Double ValidaDouble(){
        while (!input.hasNextDouble()) {
            System.out.println("Digite uma entrada válida. (Apenas números inteiros)");
            input.next();
        }
        Double escolha = input.nextDouble();
        return escolha;
    }
    public static int ValidaInt(){
        while (!input.hasNextInt()) {
            System.out.println("Digite uma entrada válida. (Apenas números)");
            input.next();
        }
        int escolha = input.nextInt();
        return escolha;
    }
    public static int AreaOrP(){
        System.out.println("Você deseja calcular a área ou perímetro?");
        System.out.println("(Leve em consideração as medidas em cm)");
        System.out.println("1.Área");
        System.out.println("2.Perímetro");
        int areaOrP = ValidaInt();
        return areaOrP;
    }
    public static int AreaOrV(){
        System.out.println("Você deseja calcular a área ou perímetro?");
        System.out.println("(Leve em consideração as medidas em cm)");
        System.out.println("1.Área");
        System.out.println("2.Volume");
        int areaOrV = ValidaInt();
        return areaOrV;
    }

    //métodos de figuras planas
    public static void Triangulo(){
        //aqui criamos um dos métodos, que será do tipo void, pois o resultado será armazenado em uma variável que será impressa na tela, ao invés de retornar como dado, isso porque caso fizessemos cada uma com a sua tipagem certinha ia dar um trabalhão para arrumar os erros de tipagens da utilização dos dados retornados no retorno deles para a main, onde estará a interface/interação com usuário
        int areaOrP = AreaOrP();
        switch (areaOrP) {
            case 1:
            System.out.println("Qual o valor da base?"); //aqui só imprime na tela a pergunta
            Double base = ValidaDouble(); //aqui chamamos o objeto input, que foi instanciado na linha 4, juntamente de "nextDouble()" que diz que o dado armazenado neste input, via Scanner, será do tipo Double e o armazenamos em uma variável de tipo Double
            System.out.println("Qual o valor da altura?");
            Double altura = ValidaDouble();
        //nas duas linhas anteriores, fazemos a mesma coisa que na linha 11 e 12, porém agora pra armazenar a altura
            Double resultA = altura*base/2;//aqui fazemos o cálculo necessário, nesse caso do triângulo a multiplicação da base pela altura, e armazenamos
            System.out.println("A área do triângulo é: "+resultA+"cm²");//aqui imprimimos na tela a variável result, que contém o resultado da conta
                break;
        
            case 2:
                System.out.println("Qual o valor dos segmentos do triângulo?"); //aqui só imprime na tela a pergunta
                System.out.println("Valor de a: ");
                Double a = ValidaDouble(); 
                System.out.println("Valor de b: ");
                Double b = ValidaDouble();
                System.out.println("Valor de c: ");
                Double c = ValidaDouble();  
                Double resultP = a+b+c;
                System.out.println("o perímetro do triângulo é: "+resultP+"cm");//aqui imprimimos na tela a variável result, que contém o resultado da conta
                break;
              
            default:
                System.out.println("Escolha uma opção válida");
                Triangulo();
            break;
        }
        }
    public void TrianguloEqui(){
        int areaOrP = AreaOrP();
        switch (areaOrP) {
            case 1:
                System.out.println("Qual o valor dos lados do triângulo?"); //aqui só imprime na tela a pergunta
                Double ladoTrianguloEquilatero = ValidaDouble();   
                System.out.println("");
                Double resultA = ((ladoTrianguloEquilatero*ladoTrianguloEquilatero)*Math.sqrt(3))/4;
                System.out.println("A Área do triângulo é: "+resultA+"cm²");
                break;    
            case 2:    
                System.out.println("Qual o valor dos lados do triângulo? "); //aqui só imprime na tela a pergunta
                Double ladoT = ValidaDouble();   
                Double resultP = ladoT*3;
                System.out.println("o perímetro do triângulo é: "+resultP+"cm");
                break;
            default:
            System.out.print("Escolha uma opção válida:");
            TrianguloEqui();
                break;
        }
    }
    public static void Retangulo(){
        int areaOrP = AreaOrP();
        Double base;
        Double altura;
        
        switch (areaOrP){
            case 1:
                System.out.print("Digite o valor da base:");
                base = ValidaDouble();
                System.out.print("Digite o valor da altura:");
                altura = ValidaDouble();
                System.out.println("O valor da área é igual a "+altura*base+"cm²");
                break;
            case 2:
                System.out.print("Digite o valor da base:");
                base = ValidaDouble();
                System.out.print("Digite o valor da altura:");
                altura = ValidaDouble();
                System.out.println("O valor do perímetro é igual a "+((2*altura)+(2*base))+"cm");
                break;
            default:System.out.print("Escolha uma opção válida:");
            Retangulo();
                break;
        }    
    }
    public static void Paralelogramo(){
        int areaOrP = AreaOrP();
        Double base;
        Double altura;
        switch (areaOrP) {
            case 1:
                System.out.print("Digite o valor da base:");
                base = ValidaDouble();
                System.out.print("Digite o valor da altura:");
                altura = ValidaDouble();
                System.out.println("O valor da área é igual a "+altura*base+"cm²");
                break;
            case 2:
                System.out.println("Qual o valor dos segmentos do triângulo?"); //aqui só imprime na tela a pergunta
                System.out.println("Valor de a: ");
                Double a = ValidaDouble(); 
                System.out.println("Valor de b: ");
                Double b = ValidaDouble();
                Double resultParalelogramo = 2*a*b;
                System.out.println("O perímetro do Paralelogramo é: "+resultParalelogramo+"cm");
                break;
            default:
            System.out.print("Escolha uma opção válida:");
            Paralelogramo();
                break;
        }
    }
    public static void Losango(){
        int areaOrP = AreaOrP();
        switch (areaOrP) {
            case 1:
                System.out.print("Qual o valor do diâmetro maior? ");
                Double Diamaior = ValidaDouble();
                System.out.print("Qual o valor do diâmetro menor? ");
                Double Diamenor = ValidaDouble();
                System.out.println("O valor da Área deste Losang é "+((Diamaior*Diamenor)/2)+"cm²");
                break;
            case 2:
                System.out.println("Qual o número de lados?");
                Double ladoLosango = ValidaDouble();
                Double resultLosango = 4*ladoLosango;
                System.out.println("O Perímetro do Losango é: "+resultLosango+"cm");
                break;
            default:System.out.print("Escolha uma opção válida:");
            Losango();
                break;
        }
    }
    public void Trapezio(){
        int areaOrP = AreaOrP();
        switch (areaOrP) {
            case 1:
                
                break;
            case 2:

                break;
            default:System.out.print("Escolha uma opção válida:");
            Trapezio();
                break;
        }
    }
    public void Circulo(){
        int areaOrP = AreaOrP();
        switch (areaOrP) {
            case 1:
                
                break;
            case 2:

                break;
            default:System.out.print("Escolha uma opção válida:");
            Circulo();
                break;
        }
    }

    public static void ValidaSair(int escolha){
        if (escolha == 0) {
            System.exit(0);
        }
    }
}

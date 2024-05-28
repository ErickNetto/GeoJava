import java.util.Scanner;

public class Plano {
    public static Scanner input = new Scanner(System.in);
    
    public static Double ValidaDouble(){
        while (!input.hasNextDouble()) {
            System.out.println("Digite uma entrada válida. (Apenas números)");
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
}

import java.util.Scanner;

public class Espacial extends Plano{
    public static Scanner input = new Scanner(System.in);

    public static void Prisma(){
        System.out.println("Deseja calcular o volume ou a área total?");
        System.out.println("(Leve em consideração as medidas em cm)");
        System.out.println("1.Volume");
        System.out.println("2.Área total");
        int volouat = ValidaInt();
        Double areaBasePrism;
        switch (volouat) {
            case 1:
            System.out.println("Qual é a área da base?");
            areaBasePrism = ValidaDouble();
            System.out.println("Qual é a altura do Prism?");
            Double alturaPrism = ValidaDouble();
            Double volumePrism = areaBasePrism*alturaPrism;
            System.out.println("O volume do Prism é de "+volumePrism+" m³");
                break;
            
            case 2:
            System.out.println("Qual é a área da base?");
            areaBasePrism = ValidaDouble();
            System.out.println("Qual é a área lateral?");
            Double areaLateralPrism = ValidaDouble();
            Double areaTotalPrism = areaBasePrism+areaLateralPrism;
            System.out.println("A área total do Prism é de "+areaTotalPrism+" m²");
                break;
            default:
                System.out.println("Escolha uma opção válida");
                break;
        }
    }
    
    
}






import java.util.Scanner;

public class Espacial extends Plano{
    public static Scanner input = new Scanner(System.in);

    public static void Prisma(){
        System.out.println("Deseja calcular o volume ou a área total?");
        System.out.println("1.Volume");
        System.out.println("2.Área total");
        int volouat = input.nextInt();
        Double areaBasePrisma;
        switch (volouat) {
            case 1:
            System.out.println("Qual é a área da base?");
            areaBasePrisma = input.nextDouble();
            System.out.println("Qual é a altura do prisma?");
            Double alturaPrisma = input.nextDouble();
            Double volumePrisma = areaBasePrisma*alturaPrisma;
            System.out.println("O volume do prisma é de "+volumePrisma+" m³");
                break;
            
            case 2:
            System.out.println("Qual é a área da base?");
            areaBasePrisma = input.nextDouble();
            System.out.println("Qual é a área lateral?");
            Double areaLateralPrisma = input.nextDouble();
            Double areaTotalPrisma = areaBasePrisma+areaLateralPrisma;
            System.out.println("A área total do prisma é de "+areaTotalPrisma+" m²");
                break;
            default:
                System.out.println("Escolha uma opção válida");
                break;
        }
    }

}

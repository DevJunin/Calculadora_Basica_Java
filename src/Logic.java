import java.util.Scanner;

public class Logic implements mathBasic{
    Scanner sc = new Scanner(System.in);
    @Override
    public double sum(double num1, double num2) {
        return num1 + num2;
    }

    @Override
    public double deduct(double num1, double num2) {
        return num1 - num2;
    }

    @Override
    public double split(double num1, double num2) {
        return num1 / num2;
    }

    @Override
    public double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    public void escolha(int escolha) {
        double num1, num2;
        switch (escolha) {
            case 1:
                System.out.println("Digite o primeiro valor: ");
                num1 = sc.nextDouble();
                System.out.println("Digite o segundo valor: ");
                num2 = sc.nextDouble();
                System.out.println("Resultado: " + sum(num1, num2) );
                break;

            case 2:
                System.out.println("Digite o primeiro valor: ");
                num1 = sc.nextDouble();
                System.out.println("Digite o segundo valor: ");
                num2 = sc.nextDouble();
                System.out.println("Resultado: " + deduct(num1, num2) );
                break;

            case 3:
                System.out.println("Digite o primeiro valor: ");
                num1 = sc.nextDouble();
                System.out.println("Digite o segundo valor: ");
                num2 = sc.nextDouble();
                System.out.println("Resultado: " + multiplication(num1, num2) );
                break;

            case 4:
                System.out.println("Digite o primeiro valor: ");
                num1 = sc.nextDouble();
                System.out.println("Digite o segundo valor: ");
                num2 = sc.nextDouble();
                System.out.println("Resultado: " + split(num1, num2) );
                break;

            case 9:
                System.out.println("Estamos encerrando o programa...");
                break;

            default:
                System.out.println("Valor inváldo");
                break;
        }
    }
}

package AtividadesMain;

import Classes.Retangulo;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o comprimento do retangulo: ");
        double x = leitor.nextDouble();
        System.out.println("Informe a largura do retangulo: ");
        double y = leitor.nextDouble();

        Retangulo retangulo = new Retangulo();
        double area = retangulo.calcularArea(x, y);
        System.out.println(String.format("A área informada é %.2f", area));
    }
}

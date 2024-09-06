package AtividadesMain;
import Classes.Cilindro;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Entre com o raio do cilindro:");
        double raio = leitor.nextDouble();
        System.out.println("Entre com a altura do cilindro:");
        double altura = leitor.nextDouble();

        Cilindro cilindro = new Cilindro(raio, altura);
        double area = cilindro.areaCilindro();
        System.out.println("Area do cilindro: " + area);
    }
}

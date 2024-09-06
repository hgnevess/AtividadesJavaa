package Classes;

public class Cilindro {
    public double raio;
    public double altura;

    public Cilindro(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
    }

    public double areaCilindro(){
        return 2*Math.PI*raio*altura;
    }
}

package school.sptech;

public class Circulo extends Figura{
    private Double raio;
    private Figura figura;

    public Circulo(Double raio) {
        this.raio = raio;
    }

    public Circulo(){}

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    public Figura getFigura() {
        return figura;
    }

    public void setFigura(Figura figura) {
        this.figura = figura;
    }

    public Double calcularArea(){
        return Math.PI*(raio*raio);
    }
}

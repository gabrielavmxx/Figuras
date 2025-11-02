package school.sptech;

public class Quadrado extends Figura {
    private Double lado;
    private Figura figura;

    public Quadrado(){}

    public Quadrado(Double lado) {
        this.lado = lado;
    }

    public Double calcularArea(){
        return lado*lado;
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    public Figura getFigura() {
        return figura;
    }

    public void setFigura(Figura figura) {
        this.figura = figura;
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "lado=" + lado +
                '}';
    }
}

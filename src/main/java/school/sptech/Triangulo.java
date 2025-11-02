package school.sptech;

public class Triangulo extends Figura{
    private Double base;
    private Double altura;
    private Figura figura;

    public Triangulo(){}

    public Triangulo(Double base, Double altura, Figura figura) {
        this.base = base;
        this.altura = altura;
        this.figura = figura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Figura getFigura() {
        return figura;
    }

    public void setFigura(Figura figura) {
        this.figura = figura;
    }

    public Double calcularArea(){
        return (base*altura)/2;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "base=" + base +
                ", altura=" + altura +
                ", figura=" + figura +
                '}';
    }
}

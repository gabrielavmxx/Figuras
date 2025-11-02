package school.sptech;

public class Retangulo extends Figura{
    private Double base;
    private Double altura;
    private Figura figura;

    public Retangulo(){}

    public Retangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Figura getFigura() {
        return figura;
    }

    public void setFigura(Figura figura) {
        this.figura = figura;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double calcularArea(){
        return base * altura;
    }

    @Override
    public String toString() {
        return "Retangulo{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }
}
